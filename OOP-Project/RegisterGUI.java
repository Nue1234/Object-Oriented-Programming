import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.io.*;

public class RegisterGUI extends JFrame {

    private JPanel contentPane;
    private JTextField UserNameField;
    private JPasswordField PasswordField;
    private JPasswordField ConfirmPasswordField;
    private JButton Loginbtn;

    public static void main(String[] args) {
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

    public RegisterGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1293, 800);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        UserNameField = new JTextField();
        UserNameField.setForeground(Color.WHITE);
        UserNameField.setFont(new Font("Tahoma", Font.PLAIN, 22));
        UserNameField.setColumns(10);
        UserNameField.setBackground(new Color(13, 13, 47));
        UserNameField.setBounds(752, 220, 431, 37);
        contentPane.add(UserNameField);

        JButton Registerbtn = new JButton("REGISTER");
        Registerbtn.setForeground(new Color(0, 0, 0));
        Registerbtn.setBackground(new Color(30, 144, 255));
        Registerbtn.setFont(new Font("Tw Cen MT", Font.BOLD, 26));
        Registerbtn.setSelected(true);
        Registerbtn.setBounds(767, 531, 399, 49);
        Registerbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = UserNameField.getText();
                String password = new String(PasswordField.getPassword());
                String confirmPassword = new String(ConfirmPasswordField.getPassword());

                if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(RegisterGUI.this, "Please fill in all the details.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(RegisterGUI.this, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (isUserExists(username)) {
                    JOptionPane.showMessageDialog(RegisterGUI.this, "Username already exists.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                registerUser(username, password);
                JOptionPane.showMessageDialog(RegisterGUI.this, "Registration successful.", "Success", JOptionPane.INFORMATION_MESSAGE);

                UserNameField.setText("");
                PasswordField.setText("");
                ConfirmPasswordField.setText("");
            }
        });
        contentPane.add(Registerbtn);

        PasswordField = new JPasswordField();
        PasswordField.setForeground(Color.WHITE);
        PasswordField.setBackground(new Color(13, 13, 47));
        PasswordField.setBounds(752, 310, 431, 37);
        contentPane.add(PasswordField);

        ConfirmPasswordField = new JPasswordField();
        ConfirmPasswordField.setForeground(Color.WHITE);
        ConfirmPasswordField.setBackground(new Color(13, 13, 47));
        ConfirmPasswordField.setBounds(752, 409, 431, 37);
        contentPane.add(ConfirmPasswordField);
                
                JLabel Usernamelbl = new JLabel("User Name");
                Usernamelbl.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
                Usernamelbl.setForeground(Color.WHITE);
                Usernamelbl.setBounds(752, 195, 109, 23);
                contentPane.add(Usernamelbl);
                        
                JLabel Passwordlbl = new JLabel("Password");
                Passwordlbl.setForeground(Color.WHITE);
                Passwordlbl.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
                Passwordlbl.setBounds(752, 285, 109, 23);
                contentPane.add(Passwordlbl);
                        
                JLabel Confirmpasswordlbl = new JLabel("Confirm Password");
                Confirmpasswordlbl.setForeground(Color.WHITE);
                Confirmpasswordlbl.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
                Confirmpasswordlbl.setBounds(752, 383, 155, 23);
                contentPane.add(Confirmpasswordlbl);
                                        
                JButton Loginbtn = new JButton("LOGIN");
                Loginbtn.setForeground(Color.BLACK);
                Loginbtn.setBackground(new Color(30, 144, 255));
                Loginbtn.setFont(new Font("Tw Cen MT", Font.BOLD, 26));
                Loginbtn.setSelected(true);
                Loginbtn.setBounds(692, 688, 119, 49);
                contentPane.add(Loginbtn);
                
                Loginbtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dispose(); // Close the RegisterGUI

                        // Open the LoginGUI
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
                });

                                        
        // Attributes of the background label
        JLabel BGlbl = new JLabel("");
        BGlbl.setBounds(0, 0, 1280, 761);
        BGlbl.setIcon(new ImageIcon("C:\\Users\\Jeck\\Documents\\Programming\\register.PNG"));
        contentPane.add(BGlbl);
    }

    private boolean isUserExists(String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Jeck\\eclipse-workspace\\OOP-project\\src\\admin.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length >= 1 && parts[0].equals(username)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void registerUser(String username, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Jeck\\eclipse-workspace\\OOP-project\\src\\admin.txt", true))) {
            writer.write(username + ":" + password);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
