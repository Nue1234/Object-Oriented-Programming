import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
public class LibrarianBooks {

	JFrame Booksframe;
	private JTextField BookNumberTF;
	private int[] bookList = {1, 4, 3, 3};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianBooks window = new LibrarianBooks();
					window.Booksframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibrarianBooks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Booksframe = new JFrame();
		Booksframe.setTitle("BORROW BOOKS");
		Booksframe.setBounds(100, 100, 857, 483);
		Booksframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Booksframe.getContentPane().setLayout(null);
		
		JLabel AvailBooks = new JLabel("AVAILABLE BOOKS");
		AvailBooks.setHorizontalAlignment(SwingConstants.CENTER);
		AvailBooks.setBounds(228, 10, 369, 76);
		Booksframe.getContentPane().add(AvailBooks);
		
		JLabel Book1 = new JLabel("0: The Hunger Games");
		Book1.setHorizontalAlignment(SwingConstants.CENTER);
		Book1.setBounds(46, 168, 232, 56);
		Booksframe.getContentPane().add(Book1);
		
		JLabel Book2 = new JLabel("1: The Fault in Our Stars");
		Book2.setHorizontalAlignment(SwingConstants.CENTER);
		Book2.setBounds(46, 223, 232, 56);
		Booksframe.getContentPane().add(Book2);
		
		JLabel Book3 = new JLabel("2: The Shining");
		Book3.setHorizontalAlignment(SwingConstants.CENTER);
		Book3.setBounds(46, 289, 232, 56);
		Booksframe.getContentPane().add(Book3);

		JLabel Author1 = new JLabel("Suzanne Collins");
		Author1.setHorizontalAlignment(SwingConstants.CENTER);
		Author1.setBounds(297, 168, 232, 56);
		Booksframe.getContentPane().add(Author1);
		
		JLabel Author2 = new JLabel("John Green");
		Author2.setHorizontalAlignment(SwingConstants.CENTER);
		Author2.setBounds(297, 223, 232, 56);
		Booksframe.getContentPane().add(Author2);
		
		JLabel Author3 = new JLabel("Stephen King");
		Author3.setHorizontalAlignment(SwingConstants.CENTER);
		Author3.setBounds(297, 289, 232, 56);
		Booksframe.getContentPane().add(Author3);

		JLabel RemainingCopy1 = new JLabel("1");
		RemainingCopy1.setHorizontalAlignment(SwingConstants.CENTER);
		RemainingCopy1.setBounds(558, 168, 232, 56);
		Booksframe.getContentPane().add(RemainingCopy1);
		
		JLabel RemainingCopy2 = new JLabel("4");
		RemainingCopy2.setHorizontalAlignment(SwingConstants.CENTER);
		RemainingCopy2.setBounds(558, 223, 232, 56);
		Booksframe.getContentPane().add(RemainingCopy2);
		
		JLabel RemainingCopy3 = new JLabel("3");
		RemainingCopy3.setHorizontalAlignment(SwingConstants.CENTER);
		RemainingCopy3.setBounds(558, 289, 232, 56);
		Booksframe.getContentPane().add(RemainingCopy3);

		JLabel BookTitlesLabel = new JLabel("BOOK TITLES :");
		BookTitlesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		BookTitlesLabel.setBounds(46, 102, 232, 56);
		Booksframe.getContentPane().add(BookTitlesLabel);
		
		JLabel AuthorsLabel = new JLabel("AUTHORS :");
		AuthorsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AuthorsLabel.setBounds(288, 102, 232, 56);
		Booksframe.getContentPane().add(AuthorsLabel);
		
		JLabel NumOfCopiesLabel= new JLabel("NUM. OF COPIES :");
		NumOfCopiesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NumOfCopiesLabel.setBounds(539, 102, 232, 56);
		Booksframe.getContentPane().add(NumOfCopiesLabel);
		
		JLabel NewLabel = new JLabel("BOOK NUMBER:");
		NewLabel.setBounds(93, 355, 142, 56);
		Booksframe.getContentPane().add(NewLabel);
		
		BookNumberTF = new JTextField();
		BookNumberTF.setBounds(257, 367, 118, 36);
		Booksframe.getContentPane().add(BookNumberTF);
		BookNumberTF.setColumns(10);
		
		JButton ButtonBorrow = new JButton("BORROW");
		ButtonBorrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == ButtonBorrow) {
		            int bookNum = Integer.parseInt(BookNumberTF.getText());
		            if (bookNum >= 0 && bookNum < bookList.length && bookList[bookNum] > 0) {
		                bookList[bookNum]--;
		                
		                JOptionPane.showMessageDialog(Booksframe, "Book borrowed successfully!");
		            } 
		            else if
		            
		            	(bookNum >= 3) {
			             
			             JOptionPane.showMessageDialog(Booksframe, "INDEX DOES NOT EXIST, try again");
		            	
		            }
		      
		            else {
		                JOptionPane.showMessageDialog(Booksframe, "Book not available.");
		            }
		        }
			}
		});
		ButtonBorrow.setBounds(399, 373, 109, 21);
		Booksframe.getContentPane().add(ButtonBorrow);
	}
}
