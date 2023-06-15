import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ToolsGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToolsGUI frame = new ToolsGUI();
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
	public ToolsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1296, 799);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// Home button
		JButton Homebtn = new JButton("Home");
        Homebtn.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        Homebtn.setBounds(75, 180, 133, 29);
        contentPane.add(Homebtn);
        
        // Action listener for the Home button
        Homebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the HomeGUI class
                HomeGUI homeGUI = new HomeGUI();
                homeGUI.setVisible(true);
                dispose(); // Close the current window
            }
        });
        
        
        // Tools button
        JButton Toolsbtn = new JButton("Tools");
        Toolsbtn.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        Toolsbtn.setBounds(75, 239, 133, 29);
        contentPane.add(Toolsbtn);
        
		
		// Loss and Damage button
		JButton ReportListbtn = new JButton("Report List");
		ReportListbtn.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		ReportListbtn.setBounds(77, 302, 133, 29);
		contentPane.add(ReportListbtn);
		
		ReportListbtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispose(); // Close the HomeGUI

		        // Open the LossAndDamageListGUI class
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

		
		// Logout button
		JButton Logoutbtn = new JButton("Log Out");
		Logoutbtn.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		Logoutbtn.setBounds(77, 362, 133, 29);
		contentPane.add(Logoutbtn);
		
		Logoutbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the LoginGUI class
                LoginGUI loginGUI = new LoginGUI();
                loginGUI.setVisible(true);
                dispose(); // Close the current window
            }
        });
		
		JLabel Imagelbl = new JLabel("");
		Imagelbl.setIcon(new ImageIcon("C:\\Users\\Jeck\\Documents\\Programming\\5.PNG"));
		Imagelbl.setBounds(0, 0, 1280, 761);
		contentPane.add(Imagelbl);
	}

}
