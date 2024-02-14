package com.example.csd214_mahib_lab1;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import java.sql.*;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;
public class HelloController implements Initializable {
    @FXML
    private TableView<Userdata> tableview;
    @FXML
    private TableColumn<Userdata,Integer > useridcol;
    @FXML
    private TableColumn<Userdata, String> usernamecol;
    @FXML
    private TableColumn<Userdata,String> emailcol;
    @FXML
    private TableColumn<Userdata,String> passwordcol;
    ObservableList<Userdata> list = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        useridcol.setCellValueFactory(new PropertyValueFactory<Userdata,Integer>("userid"));
        usernamecol.setCellValueFactory(new PropertyValueFactory<Userdata,String>("username"));
        emailcol.setCellValueFactory(new PropertyValueFactory<Userdata,String>("Email"));
        passwordcol.setCellValueFactory(new PropertyValueFactory<Userdata,String>("Password"));
        tableview.setItems(list);
    }
    @FXML protected void onloadbuttonClicked() {
        populateTable();
    }
    public void populateTable() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/csd214_mahib_lab1";
        String dbUser = "root";     String dbPassword = "";
        try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword)) {
            String query = "SELECT * FROM users";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int useridcol = resultSet.getInt("userId");
                String usernamecol = resultSet.getString("username");
                String emailcol = resultSet.getString("email");
                String passwordcol = resultSet.getString("password");
                tableview.getItems().add(new Userdata(useridcol, usernamecol, emailcol, passwordcol));
            }     } catch (SQLException e) {
            e.printStackTrace();     }
}}