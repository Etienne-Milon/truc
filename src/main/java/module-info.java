module et.truc {
    requires javafx.controls;
    requires javafx.fxml;


    opens et.truc to javafx.fxml;
    exports et.truc;
}