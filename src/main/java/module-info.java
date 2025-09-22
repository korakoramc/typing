module com.github.korakoramc {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.github.korakoramc to javafx.fxml;
    exports com.github.korakoramc;
}
