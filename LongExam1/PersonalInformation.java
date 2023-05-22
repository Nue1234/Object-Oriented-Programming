import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class PersonalInformation extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonalInformation frame = new PersonalInformation();
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
	public PersonalInformation() {
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane Addresslbl1 = new JTextPane();
		Addresslbl1.setText("250 b. Catuira st,. Niogan,\r\nPililla, Rizal\r\n1910 Philippines");
		Addresslbl1.setForeground(new Color(102, 204, 255));
		Addresslbl1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Addresslbl1.setEditable(false);
		Addresslbl1.setBackground(new Color(0, 0, 51));
		Addresslbl1.setBounds(10, 110, 223, 78);
		contentPane.add(Addresslbl1);
		
		JLabel PersonalInfolbl = new JLabel("Personal Information");
		PersonalInfolbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		PersonalInfolbl.setBackground(new Color(255, 255, 255));
		PersonalInfolbl.setForeground(new Color(255, 51, 255));
		PersonalInfolbl.setBounds(265, 30, 201, 38);
		contentPane.add(PersonalInfolbl);
		
		JLabel Addresslbl2 = new JLabel("Address:");
		Addresslbl2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		Addresslbl2.setForeground(new Color(204, 0, 255));
		Addresslbl2.setBounds(10, 79, 105, 35);
		contentPane.add(Addresslbl2);
		
		JLabel PhoneNumlbl = new JLabel("Phone Number:");
		PhoneNumlbl.setForeground(new Color(204, 0, 255));
		PhoneNumlbl.setFont(new Font("Times New Roman", Font.BOLD, 25));
		PhoneNumlbl.setBounds(10, 188, 187, 35);
		contentPane.add(PhoneNumlbl);
		
		JTextPane Numlbl = new JTextPane();
		Numlbl.setText("09101850980\r\n+639101850980\r");
		Numlbl.setForeground(new Color(102, 204, 255));
		Numlbl.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Numlbl.setEditable(false);
		Numlbl.setBackground(new Color(0, 0, 51));
		Numlbl.setBounds(10, 226, 159, 54);
		contentPane.add(Numlbl);
		
		JLabel Emaillbl = new JLabel("Email:");
		Emaillbl.setForeground(new Color(204, 0, 255));
		Emaillbl.setFont(new Font("Times New Roman", Font.BOLD, 25));
		Emaillbl.setBounds(10, 285, 187, 35);
		contentPane.add(Emaillbl);
		
		JTextPane Emailtxtlbl = new JTextPane();
		Emailtxtlbl.setText("sean.vgumarao20@gmail.com");
		Emailtxtlbl.setForeground(new Color(102, 204, 255));
		Emailtxtlbl.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Emailtxtlbl.setEditable(false);
		Emailtxtlbl.setBackground(new Color(0, 0, 51));
		Emailtxtlbl.setBounds(10, 320, 244, 38);
		contentPane.add(Emailtxtlbl);
		
		JLabel Skillslbl = new JLabel("Skills:");
		Skillslbl.setForeground(new Color(204, 0, 255));
		Skillslbl.setFont(new Font("Times New Roman", Font.BOLD, 25));
		Skillslbl.setBounds(243, 79, 187, 35);
		contentPane.add(Skillslbl);
		
		JTextPane Skillstxtlbl = new JTextPane();
		Skillstxtlbl.setText("Digital Ink Painting, Clean-up\r\nIn-between, Communication,\r\nTeamwork, Responsibility,\r\nCreativity, Problem-solving,\r\nOpenness, Adaptability. ");
		Skillstxtlbl.setForeground(new Color(102, 204, 255));
		Skillstxtlbl.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Skillstxtlbl.setEditable(false);
		Skillstxtlbl.setBackground(new Color(0, 0, 51));
		Skillstxtlbl.setBounds(243, 110, 223, 204);
		contentPane.add(Skillstxtlbl);
		
		JLabel Schools = new JLabel("Schools:");
		Schools.setForeground(new Color(204, 0, 255));
		Schools.setFont(new Font("Times New Roman", Font.BOLD, 25));
		Schools.setBounds(490, 79, 187, 35);
		contentPane.add(Schools);
		
		JTextPane Schoolstxtlbl = new JTextPane();
		Schoolstxtlbl.setText("Philippine Technological Institute of\r\nScience, Arts, and Trade\r\nInc. (PHILTECH) Tanay\r\nGrade 12 - Technical Vocational Track -\r\nInformation Communication Technology\r\nJuly 4, 2022");
		Schoolstxtlbl.setForeground(new Color(102, 204, 255));
		Schoolstxtlbl.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Schoolstxtlbl.setEditable(false);
		Schoolstxtlbl.setBackground(new Color(0, 0, 51));
		Schoolstxtlbl.setBounds(487, 116, 229, 228);
		contentPane.add(Schoolstxtlbl);
		
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
