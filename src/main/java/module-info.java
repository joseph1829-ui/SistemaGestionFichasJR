module cr.ac.una.sistemagestionfichasjr {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens cr.ac.una.sistemagestionfichasjr to javafx.fxml;
    opens cr.ac.una.sistemagestionfichasjr.controller to javafx.fxml;
    exports cr.ac.una.sistemagestionfichasjr;
}