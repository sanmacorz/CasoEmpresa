package main;

import model.Empleado;
import controller.Controlador;
import view.VentanaPrincipal;

public class Main {
        public static void main(String[] args) {
                Empleado miEmpleado = new Empleado();
                VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
                new Controlador(miVentanaPrincipal, miEmpleado);
        }
}
