package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import otp.Message;

public class MainFrame {

    private JFrame jFrame;
    private String title;
    private int width;
    private int height;
    private JTextField jTextField;
    private JLabel jLabel;
    private Message message;

    public MainFrame(String title, int width, int height, Message message) {
        this.jFrame = new JFrame();
        this.title = title;
        this.width = width;
        this.height = height;
        this.message = message;
    }

    public void display() {
        this.addButton();
        this.addTextField();
        this.createLabel();
        this.adjustFrame();
    }

    private void adjustFrame() {

        this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jFrame.setLayout(new FlowLayout());
        this.jFrame.setTitle(this.title);
        this.jFrame.getContentPane().setBackground(Color.GRAY);
        this.jFrame.setSize(this.width, this.height);
        this.jFrame.setResizable(false);
        this.jFrame.setVisible(true);
    }

    public void addTextField() {
        this.jTextField = new JTextField();
        jTextField.setPreferredSize(new Dimension(250, 40));
    
        this.jFrame.add(jTextField);
    }

    public void addButton() {

        JButton jButton = new JButton();
        jButton.setText("Encrypting");
        jButton.setBackground(Color.DARK_GRAY);
        jButton.setBounds(200, 200, 100, 50);

        jButton.addActionListener((e) -> {

            String text = this.jTextField.getText();
            String cipherText = this.message.encrypt(text);
            this.voidDisplayLabel(cipherText);
        });

        this.jFrame.add(jButton);
    }

    public void createLabel() {
        this.jLabel = new JLabel();
        this.jLabel.setBackground(Color.BLUE);
        this.jLabel.setVerticalTextPosition(JLabel.BOTTOM);
        this.jLabel.setText("hello every one");
        this.jLabel.setHorizontalTextPosition(JLabel.CENTER);
        this.jFrame.add(this.jLabel);
    }

    public void voidDisplayLabel(String text) {
        jLabel.setText(text);
    }

}
