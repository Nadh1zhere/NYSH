package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class gestionlivres   {

	private JFrame frame;
	private JTextField title;
	private JTextField price;
	private JTextField author;
	private JTextField date;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gestionlivres window = new gestionlivres();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gestionlivres() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 559, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabelTitle = new JLabel("Title");
		lblNewLabelTitle.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblNewLabelTitle.setForeground(Color.WHITE);
		lblNewLabelTitle.setBounds(43, 152, 90, 14);
		frame.getContentPane().add(lblNewLabelTitle);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblPrice.setForeground(Color.WHITE);
		lblPrice.setBounds(43, 227, 90, 14);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblAuthor.setForeground(Color.WHITE);
		lblAuthor.setBounds(43, 289, 90, 20);
		frame.getContentPane().add(lblAuthor);
		
		JLabel lblReleaseDate = new JLabel("Release Date");
		lblReleaseDate.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblReleaseDate.setForeground(Color.WHITE);
		lblReleaseDate.setBounds(43, 358, 90, 20);
		frame.getContentPane().add(lblReleaseDate);
		
		title = new JTextField();
		title.setBounds(271, 152, 192, 20);
		frame.getContentPane().add(title);
		title.setColumns(10);
		
		price = new JTextField();
		price.setColumns(10);
		price.setBounds(271, 227, 192, 20);
		frame.getContentPane().add(price);
		
		author = new JTextField();
		author.setColumns(10);
		author.setBounds(271, 289, 192, 20);
		frame.getContentPane().add(author);
		
		date = new JTextField();
		date.setColumns(10);
		date.setBounds(271, 358, 192, 20);
		frame.getContentPane().add(date);
		
		JButton Buttonajouter = new JButton("Add");
		Buttonajouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String w = price.getText(); 
				String x=date.getText();
				try{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookStore","root","");
					String query="insert into book(title,price,author,releasedate)values(?,?,?,?)";
					PreparedStatement pst = con.prepareStatement(query);
					pst.setString(1,title.getText());
					pst.setDouble(2,Double.parseDouble(w));
					pst.setString(3,author.getText());
					 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                     LocalDate localDate = LocalDate.parse(x, formatter);
					pst.setDate (4,java.sql.Date.valueOf(localDate));
					pst.executeUpdate();
			         
		            JOptionPane.showMessageDialog(null, "Book added Sucessfully!");
				
					
					
				}catch(Exception e){
		            JOptionPane.showMessageDialog(null, e);
		        }
			}
		});
		Buttonajouter.setBounds(211, 410, 89, 23);
		frame.getContentPane().add(Buttonajouter);
		
		JButton reset = new JButton("Reset");
		reset.setBounds(418, 410, 89, 23);
		frame.getContentPane().add(reset);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Siwar\\Downloads\\Ajouter un titre (2).png"));
		lblNewLabel.setBounds(0, 0, 559, 478);
		frame.getContentPane().add(lblNewLabel);
	}
}
