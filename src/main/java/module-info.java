module org.example.pruebagitfpoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.pruebagitfpoe to javafx.fxml;
    exports org.example.pruebagitfpoe;
}