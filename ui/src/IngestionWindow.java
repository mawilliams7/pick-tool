import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IngestionWindow {
    private JPanel mainPanel;
    private JTextField usernameTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel LoginTextBox;
    static JFrame mainWindow;
    private String username;
    private String password;

    public IngestionWindow() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public static void main (String [] args){
        mainWindow = new JFrame("IngestionWindow");
        mainWindow.setContentPane(new IngestionWindow().mainPanel);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.pack();
        mainWindow.setVisible(true);
    }
}
