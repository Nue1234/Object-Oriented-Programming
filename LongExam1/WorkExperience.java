import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class WorkExperience extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkExperience frame = new WorkExperience();
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
	public WorkExperience() {
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel WorkExplbl = new JLabel("Work Experience");
		WorkExplbl.setForeground(new Color(255, 51, 255));
		WorkExplbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		WorkExplbl.setBackground(Color.WHITE);
		WorkExplbl.setBounds(288, 30, 159, 38);
		contentPane.add(WorkExplbl);
		
		JLabel Studio1lbl = new JLabel("YOWZA ANIMATION STUDIOS (2020 - 2021)");
		Studio1lbl.setForeground(new Color(204, 0, 255));
		Studio1lbl.setFont(new Font("Times New Roman", Font.BOLD, 17));
		Studio1lbl.setBounds(20, 79, 348, 35);
		contentPane.add(Studio1lbl);
		
		JTextPane Studio1txtlbl = new JTextPane();
		Studio1txtlbl.setText("Performed Digital Ink Painting on various cartoon characters and assets that were used for international animated films");
		Studio1txtlbl.setForeground(new Color(102, 204, 255));
		Studio1txtlbl.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		Studio1txtlbl.setEditable(false);
		Studio1txtlbl.setBackground(new Color(0, 0, 51));
		Studio1txtlbl.setBounds(45, 114, 348, 72);
		contentPane.add(Studio1txtlbl);
		
		JLabel Studio2lbl = new JLabel("SNIPPLE ANIMATION STUDIOS (2019 - 2020)");
		Studio2lbl.setForeground(new Color(204, 0, 255));
		Studio2lbl.setFont(new Font("Times New Roman", Font.BOLD, 17));
		Studio2lbl.setBounds(158, 197, 359, 35);
		contentPane.add(Studio2lbl);
		
		JTextPane Studio2txtlbl = new JTextPane();
		Studio2txtlbl.setText("Performed Digital Ink Painting on various cartoon characters and assets that were used for international animated films");
		Studio2txtlbl.setForeground(new Color(102, 204, 255));
		Studio2txtlbl.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		Studio2txtlbl.setEditable(false);
		Studio2txtlbl.setBackground(new Color(0, 0, 51));
		Studio2txtlbl.setBounds(187, 232, 348, 72);
		contentPane.add(Studio2txtlbl);
		
		JLabel Studio3lbl = new JLabel("HYBRID QUEST ANIMATION STUDIOS (May, 2019 - Aug, 2019)\r");
		Studio3lbl.setForeground(new Color(204, 0, 255));
		Studio3lbl.setFont(new Font("Times New Roman", Font.BOLD, 17));
		Studio3lbl.setBounds(216, 315, 480, 35);
		contentPane.add(Studio3lbl);
		
		JTextPane Studio3txtlbl = new JTextPane();
		Studio3txtlbl.setText("Performed Digital Ink Painting on various cartoon characters and assets that were used for international animated films");
		Studio3txtlbl.setForeground(new Color(102, 204, 255));
		Studio3txtlbl.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		Studio3txtlbl.setEditable(false);
		Studio3txtlbl.setBackground(new Color(0, 0, 51));
		Studio3txtlbl.setBounds(244, 349, 348, 72);
		contentPane.add(Studio3txtlbl);
		
		JButton BackToHomeBtn = new JButton("Back");
		BackToHomeBtn.addActionListener(this);
		BackToHomeBtn.setForeground(new Color(102, 204, 255));
		BackToHomeBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		BackToHomeBtn.setBackground(new Color(204, 0, 255));
		BackToHomeBtn.setBounds(30, 401, 115, 30);
		contentPane.add(BackToHomeBtn);
		
		JLabel BGlbl = new JLabel("");
		BGlbl.setIcon(new ImageIcon("C:\\Users\\chiji\\Downloads\\desktop-wallpaper-circuit-board-technology-background-purple-and-blue-light-banner-electronic-system-concept-7523400-vector-art-at-vecteezy.jpg"));
		BGlbl.setBounds(-83, 0, 885, 496);
		contentPane.add(BGlbl);
	
	}
	 @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() instanceof JButton) {
	            JButton sourceButton = (JButton) e.getSource();

	            if (sourceButton.getText().equals("Back")) {
	                HomeGUI homeGUI = new HomeGUI();
	                homeGUI.setVisible(true);
	                dispose(); // Close the current frame
	            }
	        }
	    }
	}
