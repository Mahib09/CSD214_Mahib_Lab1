module com.example.csd214_mahib_lab1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                                requires com.almasb.fxgl.all;
    
    opens com.example.csd214_mahib_lab1 to javafx.fxml;
    exports com.example.csd214_mahib_lab1;
}