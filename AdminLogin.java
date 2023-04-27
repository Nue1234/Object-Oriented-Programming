import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
public class 	AdminLogin {

    JFrame AdminloginFrame;
	private JTextField UsernameTF;
	private JTextField PasswordTF;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
					frame.AdminloginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AdminloginFrame = new JFrame();
		AdminloginFrame.setBounds(100, 100, 988, 569);
		AdminloginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AdminloginFrame.getContentPane().setLayout(null);
		
		JLabel UserNLabel = new JLabel("USERNAME :");
		UserNLabel.setHorizontalAlignment(SwingConstants.CENTER);
		UserNLabel.setBounds(148, 88, 215, 52);
		AdminloginFrame.getContentPane().add(UserNLabel);
		
		JLabel PassWLabel = new JLabel("PASSWORD :");
		PassWLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PassWLabel.setBounds(148, 179, 215, 52);
		AdminloginFrame.getContentPane().add(PassWLabel);
		
		UsernameTF = new JTextField();
		UsernameTF.setBounds(355, 97, 192, 35);
		AdminloginFrame.getContentPane().add(UsernameTF);
		UsernameTF.setColumns(10);
		
		PasswordTF = new JTextField();
		PasswordTF.setColumns(10);
		PasswordTF.setBounds(355, 188, 192, 35);
		AdminloginFrame.getContentPane().add(PasswordTF);
		
		JButton LoginButton = new JButton("Login");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = UsernameTF.getText();
				String password = PasswordTF.getText();
				
				if (username.contains("Admin_01")&& password.contains("AdminOne")) {
					UsernameTF.setText(null);
					PasswordTF.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					LoginSuccessMessage wa = new LoginSuccessMessage();
					wa.Loginsuccessmessage.setVisible(true);
					AdminloginFrame.dispose();
				} else if (username.contains("Admin_02")&& password.contains("AdminTwo")) {
					UsernameTF.setText(null);
					PasswordTF.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					LoginSuccessMessage wa = new LoginSuccessMessage();
					wa.Loginsuccessmessage.setVisible(true);
					AdminloginFrame.dispose();
				} else if (username.contains("Admin_03")&& password.contains("AdminThree")) {
					UsernameTF.setText(null);
					PasswordTF.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					LoginSuccessMessage wa = new LoginSuccessMessage();
					wa.Loginsuccessmessage.setVisible(true);
					AdminloginFrame.dispose();
				} else {
					JOptionPane.showMessageDialog(null,"Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		LoginButton.setBounds(198, 290, 165, 52);
		AdminloginFrame.getContentPane().add(LoginButton);
		
		JButton BackButton = new JButton("Back");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginGUI MainFrame = new LoginGUI();
				MainFrame.mainFrame.setVisible(true);
				AdminloginFrame.dispose();
			}
		});
		BackButton.setBounds(478, 290, 165, 52);
		AdminloginFrame.getContentPane().add(BackButton);
		
		JLabel AdminLabel = new JLabel("ADMIN LOGIN");
		AdminLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AdminLabel.setBounds(243, 28, 400, 35);
		AdminloginFrame.getContentPane().add(AdminLabel);
	}
}
