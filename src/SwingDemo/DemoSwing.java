package SwingDemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class DemoSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textAge;
	JLabel lblInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoSwing frame = new DemoSwing();
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
	public DemoSwing() {
		setTitle("Demo Fram");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(35, 23, 97, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Age");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(35, 69, 97, 14);
		contentPane.add(lblNewLabel_1);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.BOLD, 14));
		textName.setBounds(192, 21, 176, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textAge = new JTextField();
		textAge.setFont(new Font("Tahoma", Font.BOLD, 14));
		textAge.setBounds(192, 66, 176, 20);
		contentPane.add(textAge);
		textAge.setColumns(10);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOk.setBounds(106, 150, 89, 23);
		contentPane.add(btnOk);
		btnOk.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
		String n=textName.getText();
		int age=Integer.parseInt(textAge.getText());
		if (age>=18)
			lblInfo.setText(n+" is eligible to vote!");
		else
			lblInfo.setText(n+" is not eligible to vote!");
			}
			});
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(279, 150, 89, 23);
		contentPane.add(btnReset);
		btnReset.addActionListener(e -> {
			textName.setText("");
			textAge.setText("");
			lblInfo.setText("");
		});
		
		lblInfo = new JLabel("");
		lblInfo.setBounds(35, 236, 333, 14);
		contentPane.add(lblInfo);
	}
}
