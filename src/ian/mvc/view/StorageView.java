package ian.mvc.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ian.mvc.controller.StorageController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StorageView extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldAge;
	private JButton btnSave, btnRemove;
	private String string,name,age,address, email, event;
	private StorageController controller;
	private JTextField textFieldAddress;
	private JLabel lblEmail;
	private JTextField textFieldEmail;

	/**
	 * Launch the application.
	 */
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StorageView frame = new StorageView();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	} */

	/**
	 * Create the frame.
	 */
	public StorageView() {
		super("Personal Data Storage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Full Name");
		lblName.setBounds(32, 48, 66, 14);
		contentPane.add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(108, 45, 188, 20);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(32, 177, 46, 14);
		contentPane.add(lblAge);
		
		textFieldAge = new JTextField();
		textFieldAge.setBounds(108, 174, 27, 20);
		contentPane.add(textFieldAge);
		textFieldAge.setColumns(10);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(46, 227, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnClean = new JButton("Clean");
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textFieldName.setText("");
				textFieldAge.setText("");
				textFieldAddress.setText("");
				textFieldEmail.setText("");
			}
		});
		btnClean.setBounds(159, 227, 89, 23);
		contentPane.add(btnClean);
		
		btnRemove = new JButton("Remove");
		btnRemove.setBounds(275, 227, 89, 23);
		contentPane.add(btnRemove);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(32, 93, 66, 14);
		contentPane.add(lblAddress);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setBounds(108, 90, 188, 20);
		contentPane.add(textFieldAddress);
		textFieldAddress.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(32, 133, 46, 14);
		contentPane.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(108, 130, 188, 20);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
	}
	
	//-------------------------------------------------------- gets
	
	public String getName() {
		
		name = textFieldName.getText();		
		return name;
	}
	
	public String getAddress() {
		
		address = textFieldAddress.getText();		
		return address ;
	}
	
	public String getEmail() {
		
		email = textFieldEmail.getText();		
		return email ;
	}
	
	public String getAge() {
		
		age = textFieldAge.getText();		
		return age;
	}
	
	//------------------------------------------------------- sets	
		
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void setAddress(String address) {
		
		this.address = address;
		
	}
	
	public void setEmail(String email) {
		
		this.email = email;
		
	}
	
	public void setAge(String age) {
		
		this.age = age;
		
	}
	
	public void setSaveButton(ActionListener SaveEvent) {
		btnSave.addActionListener(SaveEvent);
	}
	
	public void setRemoveButton(ActionListener RemoveEvent) {
		btnRemove.addActionListener(RemoveEvent);				
	}
	
	public void showData() {
		
		System.out.println("Full Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Email: "+email);
		System.out.println("Age: "+age);
	}
}
