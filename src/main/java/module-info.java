module com.chimpsource.chimpvoid {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens io.chimpsource.chimpvoid to javafx.fxml;
    exports io.chimpsource.chimpvoid;
}