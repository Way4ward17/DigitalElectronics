module com.example.digitalelectronic {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.digitalelectronic to javafx.fxml;
    exports com.example.digitalelectronic;
}