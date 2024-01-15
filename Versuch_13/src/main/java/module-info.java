module versuch_13 {
    requires javafx.controls;
    requires javafx.fxml;

    opens versuch_13 to javafx.fxml;
    exports versuch_13;
}
