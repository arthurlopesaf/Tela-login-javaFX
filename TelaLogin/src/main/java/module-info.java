module com.example.telalogin {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.telalogin to javafx.fxml;
    exports com.example.telalogin;
}