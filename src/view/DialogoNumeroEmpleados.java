package view;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class DialogoNumeroEmpleados extends JDialog {
        private JLabel lbTitulo;
        private JLabel lbEmpleados;
        private static JTextField tfEmpleados;
        public JButton btnAceptar;

        public DialogoNumeroEmpleados() {
                lbTitulo = new JLabel("Número de empleados", SwingConstants.CENTER);
                lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
                lbTitulo.setBounds(10, 10, 280, 20);

                lbEmpleados = new JLabel("Empleados = ", SwingConstants.RIGHT);
                lbEmpleados.setFont(new Font("Arial", Font.PLAIN, 18));
                lbEmpleados.setBounds(10, 85, 140, 20);

                tfEmpleados = new JTextField();
                tfEmpleados.setFont(new Font("Arial", Font.PLAIN, 18));
                tfEmpleados.setBounds(150, 85, 100, 25);

                btnAceptar = new JButton("Aceptar");
                btnAceptar.setFont(new Font("Arial", Font.PLAIN, 14));
                btnAceptar.setForeground(Color.BLACK);
                btnAceptar.setBackground(Color.WHITE);
                btnAceptar.setBorder(BorderFactory.createRaisedBevelBorder());
                btnAceptar.setBounds(95, 130, 95, 40);
                btnAceptar.setActionCommand("aceptarVentana");

                this.setLayout(null);
                this.getContentPane().setBackground(Color.decode("#e7be35"));
                this.add(lbTitulo);
                this.add(lbEmpleados);
                this.add(tfEmpleados);
                this.add(btnAceptar);
                this.setTitle("Número de empleados");
                this.setSize(300, 300);
                this.setLocationRelativeTo(null);
                this.setResizable(false);
                this.setVisible(true);
        }

        public static String getEmpleados() {
                return tfEmpleados.getText();
        }

        public void cerrarDialogo() {
                this.dispose();
        }
}
