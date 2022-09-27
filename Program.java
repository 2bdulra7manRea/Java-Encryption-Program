
import otp.Message;
import view.MainFrame;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        Message message = new Message();
        MainFrame mainFrame = new MainFrame("Encryption Program", 500, 500, message);

        mainFrame.display();
    }
}