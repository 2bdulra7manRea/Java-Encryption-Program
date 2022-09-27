package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Dimension;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
        this.addNewLabel("Provide Message to Encrypt :");
        this.addTextField();
        this.addButton();
        this.addNewLabel("Cipther Text :");
        this.createLabel();

        this.adjustFrame();
        this.adjustLayout();
        this.visible();
    }

    private void adjustFrame() {

        this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jFrame.setTitle(this.title);
        this.jFrame.getContentPane().setBackground(Color.GRAY);
        this.jFrame.setSize(this.width, this.height);
        this.jFrame.setResizable(false);
    }



    private void visible(){
        this.jFrame.setVisible(true);
    }

    private void adjustLayout(){

        this.jFrame.setLayout(new GridLayout(8,1,10,10));
    }
  



    public void addTextField() {
        this.jTextField = new JTextField();
        jTextField.setPreferredSize(new Dimension(250, 40));
    
        this.jFrame.add(jTextField);
    }

    public void addButton() {

        JButton jButton = new JButton();
        jButton.setText("Encrypting");
        jButton.setBackground(Color.LIGHT_GRAY);
        jButton.setBounds(200, 200, 200, 20);
        jButton.setFocusable(false);
        jButton.addActionListener((e) -> {

            String text = this.jTextField.getText();
            if(text.length()!=0){
            String cipherText = this.message.encrypt(text);
            String decryptedMessage =this.message.decrypt();
            this.voidDisplayLabel(cipherText,decryptedMessage);
            }
        });

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.GRAY);
        jPanel.add(jButton);

        this.jFrame.add(jPanel);
    }

    public void createLabel() {
        this.jLabel = new JLabel();
        this.jLabel.setText("");
        this.jLabel.setForeground(Color.WHITE);
        this.jFrame.add(this.jLabel);
    }

    public void addNewLabel(String text){
     JLabel jLabel = new JLabel();   
     jLabel.setText(text);   
    this.jFrame.add(jLabel);
    }

    public void voidDisplayLabel(String text , String text2) {
        jLabel.setText("Encrypted : " + text + " Decrypted :" +  text2);
    }

}
