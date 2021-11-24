package ian.mvc.app;

import ian.mvc.controller.StorageController;
import ian.mvc.model.StorageModel;
import ian.mvc.model.dao.ModelDao;
import ian.mvc.view.StorageView;

public class StorageApp {

	public static void main(String[] args){
		
		// TODO Auto-generated method stub
		
		StorageModel model = new StorageModel();
		
		StorageView view = new StorageView();
		view.setVisible(true);
		
		StorageController controller = new StorageController(view, model);
		
		//ModelDao mdao = new ModelDao();		
		//mdao.storeData(model);

	}

}
