module com.proyecto {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires java.sql;
    requires com.h2database;
    

    opens com.proyecto to javafx.fxml;
    exports com.proyecto;
}
