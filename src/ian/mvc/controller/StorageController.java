package ian.mvc.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import ian.mvc.model.StorageModel;
import ian.mvc.view.StorageView;

public class StorageController {
	
	private String event,nameView,addressView, emailView, ageView;
	
	private StorageView view;
	private StorageModel model;
	private int op;
	

	public StorageController(StorageView view, StorageModel model) {
		
		this.view = view;
		this.model = model;
		view.setSaveButton(new SaveEvent());
		view.setRemoveButton(new RemoveEvent());
	}
	
	class SaveEvent implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			 nameView = view.getName();
			 addressView = view.getAddress();
			 emailView = view.getEmail();			 
			 ageView = view.getAge();
			 sendDataToModel();
			 //view.showData();	
			 model.printSavedData();
		}
	}
	
	class RemoveEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			int op = Integer.parseInt(JOptionPane.showInputDialog("Enter with value if you want to remove :"));
			model.setId(op);
			model.printRemovedData();
		}
		
	}
	
		
	public void sendDataToModel() {
		
		model.setName(nameView);
		model.setAddress(addressView);
		model.setEmail(emailView);
		model.setAge(ageView);			
		System.out.println("Data sent to model: " +nameView+" "+addressView+" "+emailView+" "+ageView);
		
	}
	
	public void sendDataToView() {
		
		JOptionPane.showMessageDialog(null, "Saved Data!");
		
	}
	
}
