package view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class PanelProceso extends JPanel {
    public static JButton btnCalcular;
    public static JButton btnCrear;
    public JButton btnBorrar;
    public JButton btnSalir;

    public PanelProceso() {
        btnCalcular = new JButton("Calcular");
        btnCalcular.setFont(new Font("Arial", Font.PLAIN, 14));
        btnCalcular.setForeground(Color.BLACK);
        btnCalcular.setBackground(Color.WHITE);
        btnCalcular.setBorder(BorderFactory.createRaisedBevelBorder());
        btnCalcular.setBounds(70, 22, 95, 40);
        btnCalcular.setActionCommand("calcularGasto");

        btnCrear = new JButton("Crear");
        btnCrear.setFont(new Font("Arial", Font.PLAIN, 14));
        btnCrear.setForeground(Color.BLACK);
        btnCrear.setBackground(Color.WHITE);
        btnCrear.setBorder(BorderFactory.createRaisedBevelBorder());
        btnCrear.setBounds(175, 22, 95, 40);
        btnCrear.setActionCommand("crearEmpleado");

        btnBorrar = new JButton("Borrar");
        btnBorrar.setFont(new Font("Arial", Font.PLAIN, 14));
        btnBorrar.setForeground(Color.BLACK);
        btnBorrar.setBackground(Color.WHITE);
        btnBorrar.setBorder(BorderFactory.createRaisedBevelBorder());
        btnBorrar.setBounds(280, 22, 95, 40);
        btnBorrar.setActionCommand("borrarTexto");

        btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Arial", Font.PLAIN, 14));
        btnSalir.setForeground(Color.BLACK);
        btnSalir.setBackground(Color.WHITE);
        btnSalir.setBorder(BorderFactory.createRaisedBevelBorder());
        btnSalir.setBounds(385, 22, 95, 40);
        btnSalir.setActionCommand("cerrarVentana");

        this.setLayout(null);
        this.setBackground(Color.decode("#e7be35"));
        this.setVisible(true);
        this.add(btnCalcular);
        this.add(btnCrear);
        this.add(btnBorrar);
        this.add(btnSalir);
    }

    public static void desactivarBotonCalcular() {
        btnCalcular.setEnabled(false);
        btnCrear.setEnabled(true);
    }

    public static void activarBotonCalcular() {
        btnCalcular.setEnabled(true);
        btnCrear.setEnabled(false);
    }
}
