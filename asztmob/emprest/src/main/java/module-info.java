module com.example {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires unirest.java.core;
    requires gson;

    opens com.example to javafx.fxml;
    opens com.example.controllers to javafx.fxml;
    opens com.example.models to javafx.base;
    exports com.example;
}
