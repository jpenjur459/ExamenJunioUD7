package P2ImprimirPagina;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class decrementarActionListener implements ActionListener {
    JButton btn;
    P2ImprimirPaginaFrame ventana;

    public decrementarActionListener(JButton btn, P2ImprimirPaginaFrame ventana) {
        this.btn = btn;
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btnIncrementar = (JButton) e.getSource();
        int numPagina = Integer.parseInt(ventana.getTitle().split(" ")[1]);
        if (numPagina == 1){
            btn.setEnabled(false);
        }else {
            btn.setEnabled(true);
        }
        if (numPagina >1) {
            numPagina--;
        }
        ventana.setTitle("Pagina "+numPagina);
    }
}
