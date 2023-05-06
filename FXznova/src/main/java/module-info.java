module com.example.fxznova {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.fxznova to javafx.fxml;
    exports com.example.fxznova;
}