package controller;

import model.Empleado;
import view.VentanaPrincipal;
import view.DialogoNumeroEmpleados;
import view.PanelEntrada;
import view.PanelProceso;
import view.PanelSalida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {
        private VentanaPrincipal miVentanaPrincipal;
        private Empleado[] miListaEmpleados;
        private int numeroEmpleados;
        private int indice;
        private int gastoTotal;

        public Controlador(VentanaPrincipal miVentanaPrincipal, Empleado modelo) {
                this.miVentanaPrincipal = miVentanaPrincipal;
                this.miVentanaPrincipal.miDialogoNumeroEmpleados.btnAceptar.addActionListener(this);
                this.miVentanaPrincipal.miPanelProceso.btnBorrar.addActionListener(this);
                this.miVentanaPrincipal.miPanelProceso.btnSalir.addActionListener(this);
                PanelProceso.btnCalcular.addActionListener(this);
                PanelProceso.btnCrear.addActionListener(this);
        }

        public void actionPerformed(ActionEvent ae) {
                String comando = ae.getActionCommand();

                if (comando.equals("aceptarVentana")) {
                        indice = 0;
                        numeroEmpleados = Integer
                                        .parseInt(DialogoNumeroEmpleados.getEmpleados());
                        PanelSalida.mostrarResultados("La empresa posee " + numeroEmpleados + " empleados en total!\n");
                        miListaEmpleados = Empleado.crearListaEmpleados(numeroEmpleados);
                        miVentanaPrincipal.miDialogoNumeroEmpleados.cerrarDialogo();
                        PanelProceso.desactivarBotonCalcular();
                } else if (comando.equals("calcularGasto")) {
                        gastoTotal = 0;
                        for (int i = 0; i < numeroEmpleados; i++) {
                                gastoTotal += miListaEmpleados[i].calcularSalarioEmpleado(
                                                miListaEmpleados[i].getNumeroHorasMensuales(),
                                                miListaEmpleados[i].getValoracionHora());
                        }
                        PanelSalida.mostrarResultados("El gasto total de la empresa es de $" + gastoTotal + "!");

                } else if (comando.equals("crearEmpleado")) {
                        if (indice <= numeroEmpleados - 1) {
                                String nombreEmpleado = PanelEntrada.getTfNombre();
                                int numeroHoras = Integer.parseInt(PanelEntrada.getTfHoras());
                                int valoracionHora = Integer.parseInt(PanelEntrada.getTfValoracion());
                                int fechaNacimiento = Integer.parseInt(PanelEntrada.getTfFechaNacimiento());
                                int fechaIngreso = Integer.parseInt(PanelEntrada.getTfFechaIngreso());
                                Empleado miEmpleado = new Empleado(nombreEmpleado, numeroHoras, valoracionHora,
                                                fechaNacimiento, fechaIngreso);
                                miListaEmpleados[indice] = miEmpleado;
                                PanelSalida.mostrarResultados(
                                                "El empleado " + nombreEmpleado + " con "
                                                                + Empleado.calcularEdadEmpleado(fechaNacimiento)
                                                                + " años de edad y con "
                                                                + Empleado.calcularAntiguedadEmpleado(fechaIngreso)
                                                                + " años de antiguedad en la empresa!\n");
                                indice++;
                        } else {
                                JOptionPane.showMessageDialog(null, "No hay empleado disponibles");
                                PanelProceso.activarBotonCalcular();
                        }

                } else if (comando.equals("borrarTexto")) {
                        view.PanelEntrada.borrarTf();
                        PanelProceso.desactivarBotonCalcular();
                        miListaEmpleados = Empleado.crearListaEmpleados(numeroEmpleados);
                } else if (comando.equals("cerrarVentana")) {
                        JOptionPane.showMessageDialog(null, "El programa se cerrará...", "Cerrar Ventana",
                                        JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                }
        }
}
