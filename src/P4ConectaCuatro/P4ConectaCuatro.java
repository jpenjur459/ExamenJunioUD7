package P4ConectaCuatro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class P4ConectaCuatro extends JFrame {
    public P4ConectaCuatro() {
        this.setSize(288, 340);
        this.setLayout(new BorderLayout());


        JPanel panel = new JPanel(new GridLayout(6, 6));

        JLabel lblTurno = new JLabel("Turno del jugador X", JLabel.CENTER);
        lblTurno.setFont(lblTurno.getFont().deriveFont(20.0f));
        this.add(lblTurno, BorderLayout.PAGE_END);

        for (int i = 0; i < 6 * 6; i++) {

            JButton btn = new JButton();
            panel.add(btn);
        }
        this.add(panel, BorderLayout.CENTER);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
