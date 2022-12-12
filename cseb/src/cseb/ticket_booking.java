package cseb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class ticket_booking {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticket_booking window = new ticket_booking();
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
	public ticket_booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 568, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TICKET BOOKING SYSTEM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(124, 37, 315, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name  :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(40, 114, 104, 38);
		frame.getContentPane().add(lblName);
		
		JLabel lblFrom = new JLabel("From :");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFrom.setBounds(40, 183, 104, 38);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To :");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTo.setBounds(40, 280, 104, 38);
		frame.getContentPane().add(lblTo);
		
		JLabel lblNoofTickets = new JLabel("No.of Tickets :");
		lblNoofTickets.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNoofTickets.setBounds(40, 369, 130, 38);
		frame.getContentPane().add(lblNoofTickets);
		
		t1 = new JTextField();
		t1.setBounds(190, 126, 130, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Hyderabad", "Mumbai", "Delhi", "Pune"}));
		c1.setBounds(190, 194, 130, 22);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Mancherial", "Thirupathi", "Vizag", "Rameshwaram"}));
		c2.setBounds(190, 291, 130, 22);
		frame.getContentPane().add(c2);
		
		JLabel lblc = new JLabel("Cost :");
		lblc.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblc.setBounds(40, 507, 130, 29);
		frame.getContentPane().add(lblc);
		
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			int cost=0;
			public void actionPerformed(ActionEvent e) {
				
				String n=t1.getText();
				String i2=t2.getText();
				String i=(String) c1.getSelectedItem();
				String i1=(String) c2.getSelectedItem();
				cost = 500;
				JOptionPane.showConfirmDialog(btnNewButton, "Hai " +n+ "\n From station : "+i+ "\n To Station: "+i1+ "\n No.of Tickets: "+i2);
				lblc.setText("cost:"+cost);
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(143, 449, 112, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		t2 = new JTextField();
		t2.setBounds(207, 381, 113, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
	}
}
