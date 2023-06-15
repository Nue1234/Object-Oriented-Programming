import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the frame.
	 */
	public HomeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1296, 799);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton Homebtn = new JButton("Home");
        Homebtn.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        Homebtn.setBounds(75, 180, 133, 29);
        contentPane.add(Homebtn);
		
		
		JButton Toolsbtn = new JButton("Tools");
		Toolsbtn.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		Toolsbtn.setBounds(77, 242, 133, 29);
		contentPane.add(Toolsbtn);
		
		// Action listener for the Tools button	
        Toolsbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to navigate to the ToolsGUI class
                ToolsGUI toolsGUI = new ToolsGUI();
                toolsGUI.setVisible(true);
                dispose(); // Close the current window
            }
        });
		
		JButton ReportListbtn = new JButton("Report List");
		ReportListbtn.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		ReportListbtn.setBounds(77, 302, 133, 29);
		contentPane.add(ReportListbtn);
		
		ReportListbtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispose(); // Close the HomeGUI

		        // Open the LossAndDamageListGUI
		        EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                try {
		                    LossAndDamageListGUI frame = new LossAndDamageListGUI();
		                    frame.setVisible(true);
		                } catch (Exception e) {
		                    e.printStackTrace();
		                }
		            }
		        });
		    }
		});

		
		JButton Logoutbtn = new JButton("Log Out");
		Logoutbtn.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		Logoutbtn.setBounds(77, 362, 133, 29);
		contentPane.add(Logoutbtn);
		
		Logoutbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to navigate to the LoginGUI class
                LoginGUI loginGUI = new LoginGUI();
                loginGUI.setVisible(true);
                dispose(); // Close the current window
            }
        });
		
		JLabel Imagelbl = new JLabel("");
		Imagelbl.setIcon(new ImageIcon("C:\\Users\\Jeck\\Documents\\Programming\\4.PNG"));
		Imagelbl.setBounds(0, 0, 1280, 761);
		contentPane.add(Imagelbl);
	}

}
