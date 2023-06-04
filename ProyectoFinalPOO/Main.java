package ProyectoFinalPOO;

import ProyectoFinalPOO.Controller.ControladorEstados;
import ProyectoFinalPOO.Model.EstadoDeMexico;
import ProyectoFinalPOO.Persistencia.EstadoDeMexicoDAO;
import ProyectoFinalPOO.View.VentanaEstado;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        VentanaEstado view = new VentanaEstado("MVC Y JDBC");
        ControladorEstados contoller = new ControladorEstados(view);

    }
}
