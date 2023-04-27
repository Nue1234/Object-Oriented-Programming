import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LoginSuccessMessage {

	JFrame Loginsuccessmessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSuccessMessage window = new LoginSuccessMessage();
					window.Loginsuccessmessage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginSuccessMessage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Loginsuccessmessage = new JFrame();
		Loginsuccessmessage.setTitle("WELCOME");
		Loginsuccessmessage.setBounds(100, 100, 530, 300);
		Loginsuccessmessage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Loginsuccessmessage.getContentPane().setLayout(null);
		
		JLabel AdminLoginSuccess = new JLabel("Welcome to NU Library system!!");
		AdminLoginSuccess.setHorizontalAlignment(SwingConstants.CENTER);
		AdminLoginSuccess.setBounds(70, 35, 370, 110);
		Loginsuccessmessage.getContentPane().add(AdminLoginSuccess);
	}
}
