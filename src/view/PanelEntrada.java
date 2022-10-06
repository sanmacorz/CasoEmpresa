package view;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class PanelEntrada extends JPanel {
    private JLabel lbTitulo;
    private JLabel lbNombreEmpleado;
    private JLabel lbNumeroHoras;
    private JLabel lbValoracionHora;
    private JLabel lbFechaNacimiento;
    private JLabel lbFechaIngreso;
    private JLabel lbLogo;
    private ImageIcon iLogo;
    private static JTextField tfNombreEmpleado;
    private static JTextField tfNumeroHoras;
    private static JTextField tfValoracionHora;
    private static JTextField tfFechaNacimiento;
    private static JTextField tfFechaIngreso;

    public PanelEntrada() {
        lbTitulo = new JLabel("CASO EMPRESA", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLACK);
        lbTitulo.setBounds(0, 10, 572, 30);
        this.add(lbTitulo);

        lbNombreEmpleado = new JLabel("Nombre =");
        lbNombreEmpleado.setFont(new Font("Serif", Font.PLAIN, 18));
        lbNombreEmpleado.setForeground(Color.BLACK);
        lbNombreEmpleado.setBounds(240, 60, 480, 30);
        this.add(lbNombreEmpleado);

        tfNombreEmpleado = new JTextField();
        tfNombreEmpleado.setFont(new Font("Arial", Font.PLAIN, 18));
        tfNombreEmpleado.setForeground(Color.BLACK);
        tfNombreEmpleado.setBounds(365, 60, 190, 30);
        this.add(tfNombreEmpleado);

        lbNumeroHoras = new JLabel("Horas =");
        lbNumeroHoras.setFont(new Font("Serif", Font.PLAIN, 18));
        lbNumeroHoras.setForeground(Color.BLACK);
        lbNumeroHoras.setBounds(240, 100, 480, 30);
        this.add(lbNumeroHoras);

        tfNumeroHoras = new JTextField();
        tfNumeroHoras.setFont(new Font("Arial", Font.PLAIN, 18));
        tfNumeroHoras.setForeground(Color.BLACK);
        tfNumeroHoras.setBounds(365, 100, 190, 30);
        this.add(tfNumeroHoras);

        lbValoracionHora = new JLabel("Salario =");
        lbValoracionHora.setFont(new Font("Serif", Font.PLAIN, 18));
        lbValoracionHora.setForeground(Color.BLACK);
        lbValoracionHora.setBounds(240, 140, 480, 30);
        this.add(lbValoracionHora);

        tfValoracionHora = new JTextField();
        tfValoracionHora.setFont(new Font("Arial", Font.PLAIN, 18));
        tfValoracionHora.setForeground(Color.BLACK);
        tfValoracionHora.setBounds(365, 140, 190, 30);
        this.add(tfValoracionHora);

        lbFechaNacimiento = new JLabel("Nacimiento =");
        lbFechaNacimiento.setFont(new Font("Serif", Font.PLAIN, 18));
        lbFechaNacimiento.setForeground(Color.BLACK);
        lbFechaNacimiento.setBounds(240, 180, 480, 30);
        this.add(lbFechaNacimiento);

        tfFechaNacimiento = new JTextField();
        tfFechaNacimiento.setFont(new Font("Arial", Font.PLAIN, 18));
        tfFechaNacimiento.setForeground(Color.BLACK);
        tfFechaNacimiento.setBounds(365, 180, 190, 30);
        this.add(tfFechaNacimiento);

        lbFechaIngreso = new JLabel("Ingreso =");
        lbFechaIngreso.setFont(new Font("Serif", Font.PLAIN, 18));
        lbFechaIngreso.setForeground(Color.BLACK);
        lbFechaIngreso.setBounds(240, 220, 480, 30);
        this.add(lbFechaIngreso);

        tfFechaIngreso = new JTextField();
        tfFechaIngreso.setFont(new Font("Arial", Font.PLAIN, 18));
        tfFechaIngreso.setForeground(Color.BLACK);
        tfFechaIngreso.setBounds(365, 220, 190, 30);
        this.add(tfFechaIngreso);

        iLogo = new ImageIcon("src/imgs/salarios.png");

        lbLogo = new JLabel(iLogo);
        lbLogo.setOpaque(true);
        lbLogo.setBorder(BorderFactory.createRaisedBevelBorder());
        lbLogo.setBounds(20, 100, 192, 125);
        this.add(lbLogo);

        this.setLayout(null);
        this.setBackground(Color.decode("#e7be35"));
        this.setVisible(true);
    }

    public static String getTfNombre() {
        return tfNombreEmpleado.getText();
    }

    public static String getTfHoras() {
        return tfNumeroHoras.getText();
    }

    public static String getTfValoracion() {
        return tfValoracionHora.getText();
    }

    public static String getTfFechaNacimiento() {
        return tfFechaNacimiento.getText();
    }

    public static String getTfFechaIngreso() {
        return tfFechaIngreso.getText();
    }

    public static void borrarTf() {
        JOptionPane.showMessageDialog(null, "Los datos serán borrados...", "Borrar datos", JOptionPane.WARNING_MESSAGE);
        tfNombreEmpleado.setText("");
        tfNumeroHoras.setText("");
        tfValoracionHora.setText("");
        tfFechaNacimiento.setText("");
        tfFechaIngreso.setText("");
        PanelSalida.taResultados.setText("");
    }
}
