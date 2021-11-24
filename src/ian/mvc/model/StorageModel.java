package ian.mvc.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import ian.mvc.jdbc.ConnectionFactory;
import ian.mvc.model.dao.ModelDao;

public class StorageModel{
	
	private String name,address, email, age;
	private int id;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private ModelDao md;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public void printSavedData() {
		
				
		//System.out.println("Saved Data!");
		//System.out.println("Name: "+getName());
		//System.out.println("Age: "+getAge());
		md = new ModelDao();
		md.setName(name);
		md.setAge(age);
		md.setAddress(address);		
		md.setEmail(email);
		md.storeData();
		JOptionPane.showMessageDialog(null, "Saved Data!");

		//int op = Integer.parseInt(JOptionPane.showInputDialog("Enter if you want to remove :"));		
	}	
	
	public void printRemovedData() {
		
		//System.out.println("ID: "+getId());
		md = new ModelDao();
		md.setId(id);
		md.remove();
		JOptionPane.showMessageDialog(null, "Removed Data!");
	}
	
}
