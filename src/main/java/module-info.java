module com.mycompany.gui2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.gui2 to javafx.fxml;
    exports com.mycompany.gui2;
}
