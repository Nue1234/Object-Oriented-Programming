import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class LoginGUI extends JFrame {

    private JPanel contentPane;
    private JTextField UserNameField;
    private JPasswordField PassWordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginGUI frame = new LoginGUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LoginGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1293, 800);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        
        // Attributes of the Username box
        UserNameField = new JTextField();
        UserNameField.setForeground(Color.WHITE);
        UserNameField.setFont(new Font("Tahoma", Font.PLAIN, 22));
        UserNameField.setColumns(10);
        UserNameField.setBackground(new Color(13, 13, 47));
        UserNameField.setBounds(752, 218, 431, 37);
        contentPane.add(UserNameField);
        
        
        // Attributes of the Password box
        PassWordField = new JPasswordField();
        PassWordField.setBackground(new Color(13, 13, 47));
        PassWordField.setBounds(752, 311, 431, 37);
        contentPane.add(PassWordField);


        // Attributes of the Register button
        JButton RegisterBtn = new JButton("");
        
        // Add action listener to LoginNowBtn
        RegisterBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        RegisterBtn.setSelected(true);
        RegisterBtn.setContentAreaFilled(false);
        RegisterBtn.setBorderPainted(false);
        RegisterBtn.setBounds(769, 545, 399, 49);
        contentPane.add(RegisterBtn);

        // Attributes of the background label
        JLabel BGlbl = new JLabel("");
        BGlbl.setIcon(new ImageIcon("C:\\Users\\Jeck\\Downloads\\1.PNG"));
        BGlbl.setBounds(0, 0, 1280, 761);
        contentPane.add(BGlbl);
        
        // Attributes of the Login button
        JButton LoginNowBtn = new JButton("");
        LoginNowBtn.setSelected(true);
        LoginNowBtn.setContentAreaFilled(false);
        LoginNowBtn.setBorderPainted(false);
        LoginNowBtn.setBounds(769, 463, 399, 49);
        contentPane.add(LoginNowBtn);

        // Add action listener to LoginNowBtn
        LoginNowBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = UserNameField.getText();
                String password = new String(PassWordField.getPassword());

                if (isValidUser(username, password)) {
                    // Close LoginGUI
                    dispose();

                    // Open HomeGUI
                    EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            try {
                                HomeGUI frame = new HomeGUI();
                                frame.setVisible(true);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } else {
                    // Handle invalid login
                	JOptionPane.showMessageDialog(LoginGUI.this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private boolean isValidUser(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Jeck\\eclipse-workspace\\OOP-project\\src\\admin.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
