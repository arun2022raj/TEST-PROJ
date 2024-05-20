import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightSimulator extends JFrame implements ActionListener {
    private JLabel messageLabel;
    private JRadioButton redButton, yellowButton, greenButton;

    public TrafficLightSimulator() {
        setTitle("Traffic Light Simulator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create radio buttons
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        // Group radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        // Add action listener to radio buttons
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        // Create message label
        messageLabel = new JLabel();
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // Add components to frame
        JPanel radioPanel = new JPanel();
        radioPanel.add(redButton);
        radioPanel.add(yellowButton);
        radioPanel.add(greenButton);

        add(radioPanel, BorderLayout.CENTER);
        add(messageLabel, BorderLayout.NORTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            messageLabel.setText("Stop");
            messageLabel.setForeground(Color.RED);
        } else if (e.getSource() == yellowButton) {
            messageLabel.setText("Ready");
            messageLabel.setForeground(Color.YELLOW);
        } else if (e.getSource() == greenButton) {
            messageLabel.setText("Go");
            messageLabel.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TrafficLightSimulator trafficLight = new TrafficLightSimulator();
                trafficLight.setVisible(true);
            }
        });
    }
}
