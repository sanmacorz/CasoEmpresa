package view;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;

public class PanelSalida extends JPanel {
    public static JTextArea taResultados;
    public static JScrollPane spResultados;

    public PanelSalida() {
        taResultados = new JTextArea();
        taResultados.setFont(new Font("Consolas", Font.PLAIN, 16));
        taResultados.setForeground(Color.BLACK);
        taResultados.setBorder(BorderFactory.createLoweredBevelBorder());
        taResultados.setEditable(false);
        taResultados.setBounds(9, 15, 552, 258);

        spResultados = new JScrollPane(taResultados);
        spResultados.setBounds(9, 15, 552, 258);

        this.setLayout(null);
        this.setBackground(Color.decode("#e7be35"));
        this.setVisible(true);
        this.add(spResultados);

    }

    public static void mostrarResultados(String mensaje) {
        taResultados.append(mensaje);
    }

    public void borrarTa() {
        taResultados.setText("");
    }
}
