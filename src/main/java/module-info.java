module com.chimpsource.chimpvoid {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens io.chimpsource.chimpvoid to javafx.fxml;
    exports io.chimpsource.chimpvoid;
    exports io.chimpsource.chimpvoid.settings;
    opens io.chimpsource.chimpvoid.settings to javafx.fxml;
}