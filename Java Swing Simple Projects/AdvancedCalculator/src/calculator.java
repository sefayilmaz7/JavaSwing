import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;

public class calculator {

	private JFrame frmHesapMakinesi;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frmHesapMakinesi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHesapMakinesi = new JFrame();
		frmHesapMakinesi.setTitle("Hesap Makinesi");
		frmHesapMakinesi.getContentPane().setBackground(Color.PINK);
		frmHesapMakinesi.setBounds(100, 100, 450, 300);
		frmHesapMakinesi.setResizable(false);
		frmHesapMakinesi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHesapMakinesi.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField1.setBounds(263, 11, 120, 40);
		frmHesapMakinesi.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField2.setBounds(263, 63, 120, 40);
		frmHesapMakinesi.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textFieldAns = new JTextField();
		textFieldAns.setFont(new Font("Tahoma", Font.BOLD, 18));
		textFieldAns.setBounds(252, 182, 158, 56);
		frmHesapMakinesi.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Sonu\u00E7:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(172, 182, 89, 56);
		frmHesapMakinesi.getContentPane().add(lblNewLabel);
		
		JButton buttonAdd = new JButton("+");
		buttonAdd.setBackground(Color.WHITE);
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					int num1,num2,ans;
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					
					ans = num1 + num2;
					textFieldAns.setText(String.valueOf(ans));
					
					
					
				}
				catch(Exception e1) {
					
					
					JOptionPane.showMessageDialog(null, "Geçerli bir numara giriniz");
					
				}
				
				
				
			}
		});
		buttonAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonAdd.setBounds(21, 139, 50, 50);
		frmHesapMakinesi.getContentPane().add(buttonAdd);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
try {
					
					int num1,num2,ans;
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					
					ans = num1 - num2;
					textFieldAns.setText(String.valueOf(ans));
					
					
					
				}
				catch(Exception e1) {
					
					
					JOptionPane.showMessageDialog(null, "Geçerli bir numara giriniz");
					
				}
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(81, 139, 50, 50);
		frmHesapMakinesi.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("*");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
try {
					
					int num1,num2,ans;
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					
					ans = num1 * num2;
					textFieldAns.setText(String.valueOf(ans));
					
					
					
				}
				catch(Exception e1) {
					
					
					JOptionPane.showMessageDialog(null, "Geçerli bir numara giriniz");
					
				}
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(21, 200, 50, 50);
		frmHesapMakinesi.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("/");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
					
					int num1,num2,ans;
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					
					ans = num1 / num2;
					textFieldAns.setText(String.valueOf(ans));
					
					
					
				}
				catch(Exception e1) {
					
					
					JOptionPane.showMessageDialog(null, "Geçerli bir numara giriniz");
					
				}
				
				
				
				
				
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(81, 200, 50, 50);
		frmHesapMakinesi.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Birinci Say\u0131");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(141, 12, 120, 33);
		frmHesapMakinesi.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0130kinci Say\u0131");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(141, 64, 120, 33);
		frmHesapMakinesi.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("created by sefayilmaz");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(278, 249, 132, 14);
		frmHesapMakinesi.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_3 = new JButton("C");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				textField1.setText(null);
				textField2.setText(null);
				textFieldAns.setText(null);
				
				
				
				
				
				
				
			}
		});
		btnNewButton_3.setBounds(21, 102, 110, 33);
		frmHesapMakinesi.getContentPane().add(btnNewButton_3);
	}
}
