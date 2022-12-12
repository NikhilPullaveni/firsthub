package training_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class E_commerce {
int i=0;
int bill=0;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E_commerce window = new E_commerce();
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
	public E_commerce() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 804, 606);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FLIPZON DEAL");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(165, 27, 321, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\CSE\\Desktop\\Captured1.PNG"));
		lblNewLabel_1.setBounds(46, 142, 168, 199);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\CSE\\Desktop\\Captured2.PNG"));
		lblNewLabel_2.setBounds(281, 142, 154, 199);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\CSE\\Desktop\\Captured3.PNG"));
		lblNewLabel_3.setBounds(538, 142, 159, 199);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblcart = new JLabel("CART :  ");
		lblcart.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblcart.setBounds(563, 61, 108, 43);
		frame.getContentPane().add(lblcart);
		
		JLabel lblbill = new JLabel("BILL :");
		lblbill.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblbill.setBounds(556, 473, 154, 31);
		frame.getContentPane().add(lblbill);
		
		
		JButton lblcar = new JButton("Add to Cart");
		lblcar.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblcar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				lblcart.setText("Cart :"+i);
				bill=bill+500;
				lblbill.setText("BILL :" +bill);
			}
		});
		lblcar.setBounds(73, 400, 141, 23);
		frame.getContentPane().add(lblcar);
		
		JLabel lblNewLabel_4 = new JLabel("500/-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(103, 352, 67, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
			
					i++;
					lblcart.setText("Cart :"+i);
					bill=bill+600;
					lblbill.setText("BILL :" +bill);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(307, 400, 127, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lblcart.setText("Cart :"+i);
				bill=bill+400;
				lblbill.setText("BILL :" +bill);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(556, 402, 127, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("600/-");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(338, 360, 67, 23);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("400/-");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_2.setBounds(579, 360, 67, 23);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		
		
	}
}
