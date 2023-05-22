import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class HomeGUI extends PersonalInformation implements ActionListener {

    private JPanel contentPane;
    private JButton personalInfoBtn;
    private JButton workExperienceBtn;
    private JButton previousProjectbtn;

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
        setTitle("Portfolio");
        setBackground(new Color(240, 240, 240));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 750, 500);
        contentPane = new JPanel();
        contentPane.setBackground(Color.DARK_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel namelbl = new JLabel("Sean Kervin V. Gumarao");
        namelbl.setForeground(new Color(204, 0, 255));
        namelbl.setBackground(Color.WHITE);
        namelbl.setFont(new Font("Times New Roman", Font.BOLD, 30));
        namelbl.setBounds(344, 66, 326, 39);
        contentPane.add(namelbl);
        
        JLabel introlbl = new JLabel("Hi! I am");
        introlbl.setBackground(new Color(255, 255, 255));
		introlbl.setForeground(new Color(204, 0, 255));
		introlbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		introlbl.setBounds(464, 39, 98, 22);
		contentPane.add(introlbl);
		
		JTextPane InfoAboutMe = new JTextPane();
		InfoAboutMe.setForeground(new Color(102, 204, 255));
		InfoAboutMe.setEditable(false);
		InfoAboutMe.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		InfoAboutMe.setBackground(new Color(0, 0, 51));
		InfoAboutMe.setText("I am a digital artist with significant experience in digital paintings of\r\ncartoon characters that are used on various international animated\r\nfilms. I also have experiences in digital Ink Painting,\r\nClean-up In-between.");
		InfoAboutMe.setBounds(364, 116, 285, 198);
		contentPane.add(InfoAboutMe);
		
		JLabel Imagelbl = new JLabel("");
		Imagelbl.setIcon(new ImageIcon("C:\\Users\\chiji\\Downloads\\1-removebg-preview (1) (4).png"));
		Imagelbl.setBounds(83, 90, 180, 222);
		contentPane.add(Imagelbl);
		
		personalInfoBtn = new JButton("Personal Information");
        personalInfoBtn.setForeground(new Color(102, 204, 255));
        personalInfoBtn.setBackground(new Color(204, 0, 255));
        personalInfoBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
        personalInfoBtn.addActionListener(this);
        personalInfoBtn.setBounds(10, 360, 223, 30);
        contentPane.add(personalInfoBtn);
		
        workExperienceBtn = new JButton("Work Experience");
        workExperienceBtn.addActionListener(this);
        workExperienceBtn.setForeground(new Color(102, 204, 255));
        workExperienceBtn.setBackground(new Color(204, 0, 255));
        workExperienceBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
        workExperienceBtn.setBounds(261, 360, 209, 30);
        contentPane.add(workExperienceBtn);
		
		previousProjectbtn = new JButton("Previous Projects");
		previousProjectbtn.addActionListener(this);
		previousProjectbtn.setForeground(new Color(102, 204, 255));
		previousProjectbtn.setBackground(new Color(204, 0, 255));
		previousProjectbtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		previousProjectbtn.setBounds(501, 360, 223, 30);
		contentPane.add(previousProjectbtn);
		
		JLabel BGlbl = new JLabel("");
		BGlbl.setIcon(new ImageIcon("C:\\Users\\chiji\\Downloads\\desktop-wallpaper-circuit-board-technology-background-purple-and-blue-light-banner-electronic-system-concept-7523400-vector-art-at-vecteezy.jpg"));
		BGlbl.setBounds(-83, 0, 885, 496);
		contentPane.add(BGlbl);

        // Other code...

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == personalInfoBtn) {
            PersonalInformation personalInformation = new PersonalInformation();
            personalInformation.setVisible(true);
            this.dispose();
            }
        
        if (e.getSource() == workExperienceBtn) {
        	WorkExperience workExperience = new WorkExperience();
            workExperience.setVisible(true);
            this.dispose();
            }
        
        if (e.getSource() == previousProjectbtn) {
        	PreviousProject previousProject = new PreviousProject();
        	previousProject.setVisible(true);
            this.dispose();
        }
    }
}
