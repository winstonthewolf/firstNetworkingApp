module com.example.firstnetworkingapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstnetworkingapp to javafx.fxml;
    exports com.example.firstnetworkingapp;
}