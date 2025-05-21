  private void handleButtonClick(ActionEvent e) {
        // Handle button actions
        JButton source = (JButton)e.getSource();
        JOptionPane.showMessageDialog(this, "Action: " + source.getText());
    }
