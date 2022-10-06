package view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class VentanaPrincipal extends JFrame {
    public PanelEntrada miPanelEntrada;
    public PanelProceso miPanelProceso;
    public PanelSalida miPanelSalida;
    public DialogoNumeroEmpleados miDialogoNumeroEmpleados;

    public VentanaPrincipal() {
        miPanelEntrada = new PanelEntrada();
        miPanelEntrada.setBounds(10, 10, 572, 260);

        miPanelProceso = new PanelProceso();
        miPanelProceso.setBounds(10, 280, 572, 80);

        miPanelSalida = new PanelSalida();
        miPanelSalida.setBounds(10, 370, 572, 288);

        this.setTitle("Caso Empresa");
        this.setSize(600, 700);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.add(miPanelEntrada);
        this.add(miPanelProceso);
        this.add(miPanelSalida);

        miDialogoNumeroEmpleados = new DialogoNumeroEmpleados();
        miDialogoNumeroEmpleados.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    }
}
