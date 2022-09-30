module com.juliengabryelewicz.imc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.juliengabryelewicz.imc to javafx.fxml;
    exports com.juliengabryelewicz.imc;
}