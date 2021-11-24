package ian.mvc.model.dao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import ian.mvc.jdbc.ConnectionFactory;
import ian.mvc.model.StorageModel;

public class ModelDao {
	
	private Connection connection;
	String name, address,email, age;
	int id;
	private StorageModel model;
	
	public ModelDao() {
		
		this.connection = new ConnectionFactory().getConnection();	
		
	}
	
			
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


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

	public void storeData(){
		
		String sql = "insert into person  "+"(person_name,person_address,person_email, person_age)"+" values (?,?,?,?)";
		try {
			
			model = new StorageModel();
			
			PreparedStatement	stmt	=	connection.prepareStatement(sql);
			stmt.setString(1, getName());
			stmt.setString(2, getAddress());
			stmt.setString(3, getEmail());
			stmt.setString(4, getAge());
			//System.out.println("from modeldao: "+getName());
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e) {
			
			throw new	RuntimeException(e);
			
		}
		
	}
	
	
	public void remove()
	{
		String sql = "delete from person where person_id=?";
		try
		{
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, getId());
			stmt.execute();
			stmt.close();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
