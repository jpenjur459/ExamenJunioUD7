package P2ImprimirPagina;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReiniciarActionListener implements ActionListener {
    P2ImprimirPaginaFrame ventana;

    public ReiniciarActionListener(P2ImprimirPaginaFrame ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ventana.setTitle("Pagina 1");
    }
}
