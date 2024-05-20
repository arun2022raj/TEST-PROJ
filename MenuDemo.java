import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuDemo extends JFrame implements ActionListener {
    public MenuDemo() {
        setTitle("Menu Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menu
        JMenu fileMenu = new JMenu("File");

        // Create menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add menu items to menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Add separator
        fileMenu.add(exitItem);

        // Add menu to menu bar
        menuBar.add(fileMenu);

        // Set menu bar to frame
        setJMenuBar(menuBar);

        // Add action listeners to menu items
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String message = "Option clicked: " + ((JMenuItem) e.getSource()).getText();
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MenuDemo menuDemo = new MenuDemo();
                menuDemo.setVisible(true);
            }
        });
    }
}
