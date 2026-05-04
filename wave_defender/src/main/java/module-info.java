module wavedefender {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;


    opens wavedefender.game to javafx.fxml;
    exports wavedefender.game;
}
