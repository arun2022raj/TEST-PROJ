import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class events extends JFrame implements ActionListener {
    private JButton button;

    public events() {
        setTitle("Event Delegation Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create a button (Event Source)
        button = new JButton("Click Me");
        button.addActionListener(this); // Register ActionListener (Event Listener)
        add(button);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button click event
        JOptionPane.showMessageDialog(this, "Button Clicked!");
    }

    public static void main(String[] args) {
        // Create and display the JFrame
        SwingUtilities.invokeLater(() -> new events());
    }
}
