module fr.uha.hassenforder.flight.client {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires fr.uha.hassenforder.flight.common;
	requires javafx.base;

    opens fr.uha.hassenforder.flight.client.view to javafx.fxml;
    exports fr.uha.hassenforder.flight.client;
}
