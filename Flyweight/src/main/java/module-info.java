module swingborder.flyweight {
    requires javafx.controls;
    requires javafx.fxml;

    opens swingborder.flyweight to javafx.fxml;
    exports swingborder.flyweight;
}
