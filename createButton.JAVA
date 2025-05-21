 private JButton createButton(String text, String colorHex) {
        JButton btn = new JButton(text);
        btn.setBackground(Color.decode(colorHex));
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        btn.addActionListener(this::handleButtonClick);
        return btn;
    }
