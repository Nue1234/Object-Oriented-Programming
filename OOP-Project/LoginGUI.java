import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class LoginGUI extends JFrame {

    private JPanel contentPane;
    private JTextField UserNameField;
    private JPasswordField PassWordField;
    private JLabel Usernamelbl;
    private JLabel Passwordlbl;

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
        PassWordField.setForeground(Color.WHITE);
        PassWordField.setBackground(new Color(13, 13, 47));
        PassWordField.setBounds(752, 311, 431, 37);
        contentPane.add(PassWordField);

        
     // Attributes of the Register button
        JButton Registerbtn = new JButton("REGISTER");
        Registerbtn.setForeground(new Color(0, 0, 0));
        Registerbtn.setFont(new Font("Tw Cen MT", Font.BOLD, 26));
        Registerbtn.setBackground(new Color(30, 144, 255));
        Registerbtn.setSelected(true);
        Registerbtn.setBounds(769, 545, 399, 49);
        contentPane.add(Registerbtn);

        // Add action listener to LoginNowBtn
        Registerbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the LoginGUI

                // Open the RegisterGUI
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            RegisterGUI frame = new RegisterGUI();
                            frame.setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });

        
        
        // Attributes of the Login button
        JButton Loginbtn = new JButton("LOGIN");
        Loginbtn.setForeground(Color.BLACK);
        Loginbtn.setBackground(new Color(30, 144, 255));
        Loginbtn.setFont(new Font("Tw Cen MT", Font.BOLD, 26));
        Loginbtn.setSelected(true);
        Loginbtn.setBounds(769, 463, 399, 49);
        contentPane.add(Loginbtn);
        
        Usernamelbl = new JLabel("User Name");
        Usernamelbl.setForeground(Color.WHITE);
        Usernamelbl.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
        Usernamelbl.setBounds(752, 191, 109, 23);
        contentPane.add(Usernamelbl);
        
        Passwordlbl = new JLabel("Password");
        Passwordlbl.setForeground(Color.WHITE);
        Passwordlbl.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
        Passwordlbl.setBounds(752, 285, 109, 23);
        contentPane.add(Passwordlbl);
        
        // Attributes of the background label
        JLabel BGlbl = new JLabel("");
        BGlbl.setIcon(new ImageIcon("C:\\Users\\Jeck\\Documents\\Programming\\login.PNG"));
        BGlbl.setBounds(0, 0, 1280, 761);
        contentPane.add(BGlbl);

        // Add action listener to LoginNowBtn
        Loginbtn.addActionListener(new ActionListener() {
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
