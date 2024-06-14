package P1EtiquetasColoridas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P1EtiquetasColoridas extends JFrame {

    JLabel titulo;
    JRadioButton rojo;
    JRadioButton verde;
    JRadioButton azul;

    public P1EtiquetasColoridas() throws HeadlessException{
        setTitle("Selecciona Color");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        titulo = new JLabel("Selecciona Color", JLabel.CENTER);

        rojo = new JRadioButton("Rojo");
        verde = new JRadioButton("Verde");
        azul = new JRadioButton("Azul");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rojo);
        grupo.add(verde);
        grupo.add(azul);

        rojo.addActionListener(new ColorActionListener(Color.RED, "Rojo"));
        verde.addActionListener(new ColorActionListener(Color.GREEN, "Verde"));
        azul.addActionListener(new ColorActionListener(Color.BLUE, "Azul"));

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(3,1));
        radioPanel.add(rojo);
        radioPanel.add(verde);
        radioPanel.add(azul);

        setLayout(new BorderLayout());
        add(titulo, BorderLayout.PAGE_START);
        add(radioPanel, BorderLayout.LINE_START);

        setVisible(true);
    }

    private class ColorActionListener implements ActionListener {
        Color color;
        String nombre;

        public ColorActionListener(Color color, String nombre) {
            this.color = color;
            this.nombre = nombre;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            titulo.setText("Seleccionado: " + nombre);
            titulo.setForeground(color);
        }
    }
}
