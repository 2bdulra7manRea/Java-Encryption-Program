package view;


import javax.swing.JTextField;

public class TextFieldsFrame {
    

    private JTextField textField;

   public TextFieldsFrame(){
        this.textField = new JTextField();
        // this.textField.setPreferredSize(new Dimension(30,40));
    }
    public JTextField display(){
        return this.textField;
    }

}
