module com.example.practicescenes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practicescenes to javafx.fxml;
    exports com.example.practicescenes;
}