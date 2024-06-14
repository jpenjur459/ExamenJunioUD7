package P2ImprimirPagina;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class SalirActionListener extends AbstractAction {
    public SalirActionListener() {
        super("salir");
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
