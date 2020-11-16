package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.DriverManager;
import javax.swing.SwingConstants;

public class interfaceauthentification {

	private JFrame frame;
	private JTextField username1;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaceauthentification window = new interfaceauthentification();
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
	public interfaceauthentification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 567, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(51, 234, 95, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblPassword.setBounds(51, 307, 95, 28);
		frame.getContentPane().add(lblPassword);
		
		JButton signin = new JButton("Log In");
		signin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		        try{
		           
		           
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookStore","root","");
		            String sql = "Select * from login where username=? and password = ?";
		            PreparedStatement pst = con.prepareStatement(sql);
		            pst.setString(1, username1.getText());
		            pst.setString(2, password.getText());
		            ResultSet rs = pst.executeQuery();
		            if(rs.next()){
		            	
		                JOptionPane.showMessageDialog(null, "Username and Password Matched");
		           
		               
		                
		              
					
		             
		            }
		            else{
		                JOptionPane.showMessageDialog(null, "Username and password not Correct");
		                username1.setText("");
		                password.setText("");
		            }
		            con.close();
		        }
		        catch(Exception e){
		            JOptionPane.showMessageDialog(null, e);
		        }
				
				
			}
		});//close of action listener 
		signin.setBackground(Color.WHITE);
		signin.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		signin.setForeground(Color.DARK_GRAY);
		signin.setBounds(92, 413, 95, 29);
		frame.getContentPane().add(signin);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(317, 234, 200, 36);
		frame.getContentPane().add(panel);
		
		username1 = new JTextField();
		username1.setBackground(new Color(245, 245, 245));
		username1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			if(username1.getText().equals("UserName")) {
				username1.setText("");
			}
			else {
				username1.selectAll();
			}
			
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (username1.getText().equals(""))
					username1.setText("Username");
			}
		});
		username1.setBorder(null);
		panel.add(username1);
		username1.setColumns(11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 245));
		panel_1.setBounds(317, 307, 200, 36);
		frame.getContentPane().add(panel_1);
		
		password = new JPasswordField();
		password.setBackground(new Color(245, 245, 245));
		password.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(password.getText().equals("Password")) {
					password.setEchoChar('●');
					password.setText("");
				}
				else {
					password.selectAll();
				}
				
			
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(password.getText().equals("")) {
					password.setText("Password");
					password.setEchoChar((char)0);
				}
			}
		});
		password.setBorder(null);
		password.setColumns(11);
		panel_1.add(password);
		
		JButton reset = new JButton("Reset");
		reset.setForeground(Color.DARK_GRAY);
		reset.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		reset.setBackground(Color.WHITE);
		reset.setBounds(388, 413, 95, 29);
		frame.getContentPane().add(reset);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Siwar\\Downloads\\Ajouter un titre (3).png"));
		lblNewLabel_1.setBounds(0, 0, 567, 486);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
