import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;

public class LibrarianLogin {

	JFrame LibrarianloginFrame;
	private JTextField UsernameTF;
	private JTextField PasswordTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianLogin frame = new LibrarianLogin();
					frame.LibrarianloginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibrarianLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LibrarianloginFrame = new JFrame();
		LibrarianloginFrame.setBounds(100, 100, 925, 545);
		LibrarianloginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LibrarianloginFrame.getContentPane().setLayout(null);
		
		JLabel LibrarianLoginLabel = new JLabel("LIBRARIAN LOGIN");
		LibrarianLoginLabel.setHorizontalAlignment(SwingConstants.CENTER);
	
		LibrarianLoginLabel.setBounds(262, 49, 400, 35);
		LibrarianloginFrame.getContentPane().add(LibrarianLoginLabel);
		
		JLabel UsernameLabel = new JLabel("USERNAME :");
		UsernameLabel.setHorizontalAlignment(SwingConstants.CENTER);

		UsernameLabel.setBounds(148, 125, 215, 52);
		LibrarianloginFrame.getContentPane().add(UsernameLabel);
		
		JLabel PassWLabel = new JLabel("PASSWORD :");
		PassWLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PassWLabel.setBounds(148, 195, 215, 52);
		LibrarianloginFrame.getContentPane().add(PassWLabel);
		
		UsernameTF = new JTextField();
		UsernameTF.setColumns(10);
		UsernameTF.setBounds(380, 136, 192, 35);
		LibrarianloginFrame.getContentPane().add(UsernameTF);
		
		PasswordTF = new JTextField();
		PasswordTF.setColumns(10);
		PasswordTF.setBounds(380, 206, 192, 35);
		LibrarianloginFrame.getContentPane().add(PasswordTF);
		
		JButton LoginButton = new JButton("Login");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = UsernameTF.getText();
				String password = PasswordTF.getText();
				
				if (username.contains("Librarian_01")&& password.contains("LibOne")) {
					UsernameTF.setText(null);
					PasswordTF.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					LibrarianBooks lb = new LibrarianBooks();
					lb.Booksframe.setVisible(true);
					LibrarianloginFrame.dispose();
				} else if (username.contains("Librarian_02")&& password.contains("LibTwo")) {
					UsernameTF.setText(null);
					PasswordTF.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					LibrarianBooks lb = new LibrarianBooks();
					lb.Booksframe.setVisible(true);
					LibrarianloginFrame.dispose();
				} else if (username.contains("Librarian_03")&& password.contains("LibThree")) {
					UsernameTF.setText(null);
					PasswordTF.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					LibrarianBooks lb = new LibrarianBooks();
					lb.Booksframe.setVisible(true);
					LibrarianloginFrame.dispose();
				} else {
					JOptionPane.showMessageDialog(null,"INCORRECT USERNAME OR PASSWORD", "Login Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		LoginButton.setBounds(198, 314, 165, 52);
		LibrarianloginFrame.getContentPane().add(LoginButton);
		
		JButton BackButton = new JButton("Back");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginGUI MainFrame = new LoginGUI();
				MainFrame.mainFrame.setVisible(true);
				LibrarianloginFrame.dispose();
			}
		});
		BackButton.setBounds(497, 314, 165, 52);
		LibrarianloginFrame.getContentPane().add(BackButton);
	}

}
