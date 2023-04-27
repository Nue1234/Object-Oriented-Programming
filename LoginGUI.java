import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;

public class LoginGUI {

	JFrame mainFrame;
	public final Action action = new SwingAction();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginGUI() {
		initialize();
	}

	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setBounds(100, 100, 1000, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		JButton LibrarianButton = new JButton("Librarian Login");
		LibrarianButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianLogin LibLogin = new LibrarianLogin();
				LibLogin.LibrarianloginFrame.setVisible(true);
				mainFrame.dispose();
			}
		});
		LibrarianButton.setBounds(350,300, 300, 70);
		mainFrame.getContentPane().add(LibrarianButton);
		
		JButton AdminButton = new JButton("Admin Login");
		AdminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin AdminLogin = new AdminLogin();
				AdminLogin.AdminloginFrame.setVisible(true);
				mainFrame.dispose();
                
			}
		});
		AdminButton.setBounds(350, 200, 300, 70);
		mainFrame.getContentPane().add(AdminButton);
		
		JLabel LibrarianLabel = new JLabel("LIBRARY MANAGEMENT");
		LibrarianLabel.setHorizontalAlignment(SwingConstants.CENTER);
		LibrarianLabel.setBounds(250, 50, 500, 70);
		mainFrame.getContentPane().add(LibrarianLabel);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
