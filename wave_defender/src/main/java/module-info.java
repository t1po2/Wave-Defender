module com.wavedefender {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;


    opens wavedefender to javafx.fxml;
    exports wavedefender;
}
