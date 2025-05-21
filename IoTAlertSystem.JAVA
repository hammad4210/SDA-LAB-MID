import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class IoTAlertSystem extends JFrame {

    public IoTAlertSystem() {
        setTitle("IoT Server | Alert System");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.setBackground(new Color(240, 240, 240));

        // Function buttons
        JPanel funcPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        funcPanel.setBackground(new Color(240, 240, 240));
        
        String[] buttonData = {
            "sandersonclub()", "#4CAF50",
            "analyzeclab()", "#2196F3",
            "defect-dangerous Act()", "#FF5722"
        };

        for(int i=0; i<buttonData.length; i+=2) {
            JButton btn = createButton(buttonData[i], buttonData[i+1]);
            funcPanel.add(btn);
        }

        // Alert section
        JPanel alertPanel = new JPanel();
        alertPanel.setLayout(new BoxLayout(alertPanel, BoxLayout.Y_AXIS));
        alertPanel.setBorder(BorderFactory.createTitledBorder("All | Dangerous Activity"));
        alertPanel.setBackground(Color.WHITE);

        JButton createAlertBtn = createButton("Create Alert() defect", "#F44336");
        JButton notifyAlertBtn = createButton("Notify Alert()", "#9C27B0");
        
        alertPanel.add(Box.createVerticalStrut(10));
        alertPanel.add(createAlertBtn);
        alertPanel.add(Box.createVerticalStrut(10));
        alertPanel.add(notifyAlertBtn);
        alertPanel.add(Box.createVerticalStrut(10));

        // Assemble components
        mainPanel.add(funcPanel);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(alertPanel);
        
        add(mainPanel);
        setVisible(true);
    }

    private JButton createButton(String text, String colorHex) {
        JButton btn = new JButton(text);
        btn.setBackground(Color.decode(colorHex));
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        btn.addActionListener(this::handleButtonClick);
        return btn;
    }

    private void handleButtonClick(ActionEvent e) {
        // Handle button actions
        JButton source = (JButton)e.getSource();
        JOptionPane.showMessageDialog(this, "Action: " + source.getText());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new IoTAlertSystem());
    }
}
