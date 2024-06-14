package P2ImprimirPagina;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class incrementarActionListener implements ActionListener {
    JButton btn;
    P2ImprimirPaginaFrame ventana;

    public incrementarActionListener(JButton btn, P2ImprimirPaginaFrame ventana) {
        this.btn = btn;
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btnIncrementar = (JButton) e.getSource();
        int num_pagina = Integer.parseInt(ventana.getTitle().split(" ")[1]);

        num_pagina++;
        ventana.setTitle("Pagina "+num_pagina);
    }
}

