module com.example.digitalelectronic {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.base;
    requires javafx.graphics;
    requires java.base;
    requires javafx.media;

    opens com.example.digitalelectronic to javafx.fxml;
    exports com.example.digitalelectronic;
}