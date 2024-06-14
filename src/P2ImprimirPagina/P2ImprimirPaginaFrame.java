package P2ImprimirPagina;

import javax.swing.*;
import java.awt.*;

public class P2ImprimirPaginaFrame extends JFrame {
    public P2ImprimirPaginaFrame() throws HeadlessException {
        setTitle("Página 1");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel pnlBotones = new JPanel(new FlowLayout());
        JButton btnAnterior = new JButton("< Anterior");
        btnAnterior.addActionListener(new decrementarActionListener(btnAnterior,this));
        JButton btnSiguiente = new JButton("Siguiente >");
        btnSiguiente.addActionListener(new incrementarActionListener(btnSiguiente,this));
        JMenuBar menu = new JMenuBar();
        JMenu operaciones = new JMenu("operaciones");
        JMenuItem Reiniciar = new JMenuItem("Reiniciar");
        Reiniciar.addActionListener(new ReiniciarActionListener(this));
        SalirActionListener salir = new SalirActionListener();
        operaciones.add(Reiniciar);
        operaciones.addSeparator();
        operaciones.add(salir);
        menu.add(operaciones);
        setJMenuBar(menu);
        pnlBotones.add(btnAnterior);
        pnlBotones.add(btnSiguiente);
        add(pnlBotones, BorderLayout.CENTER);

        setVisible(true);
    }
}
