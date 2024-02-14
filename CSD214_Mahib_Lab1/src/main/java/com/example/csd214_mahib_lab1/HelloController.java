package com.example.csd214_mahib_lab1;
import com.example.csd214_mahib_lab1.Model.Userdata;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML; import javafx.fxml.Initializable;
import javafx.scene.control.Label; import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL; import java.util.ResourceBundle;
public class HelloController implements Initializable {
    @FXML
    private TableView<Userdata> tableView;
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
        useridcol.setCellValueFactory(new PropertyValueFactory<Userdata,Integer>("useridcol"));
        usernamecol.setCellValueFactory(new PropertyValueFactory<Userdata,String>("usernamecol"));
        emailcol.setCellValueFactory(new PropertyValueFactory<Userdata,String>("emailcol"));
        passwordcol.setCellValueFactory(new PropertyValueFactory<Userdata,String>("passwordcol"));
        tableView.setItems(list);     }
    @FXML
    protected void onloadbuttonClicked() {

    }
}