package database;

import main.Client;
import main.Product;
import main.Sale;

public class Database implements DatabaseInterface {
	private static Database instance;
	
	
	
	private Database() {
		//Conection with Database Server
		
		}
	
	public static Database getInstance() {
		if(Database.instance==null) {
			Database.instance= new Database();
		}
		
		return Database.instance;
	}

	@Override
	public boolean addProduct(Product p) {
		// TODO insert In Database
		/*if(insertion was Successful) {
			return true;
		}else {
			return false;
		}*/
	
	}

	@Override
	public boolean addClient(Client c) {
		// TODO insert In Database
		/*if(insertion was Successful) {
			return true;
		}else {
			return false;
		}*/
		
	}

	@Override
	public boolean addSale(Sale s) {
		// TODO insert In Database
		/*if(insertion was Successful) {
			return true;
		}else {
			return false;
		}*/
		
	}

	@Override
	public Product getProduct(String id) {
		// TODO Query in Database
		return null;
	}

	@Override
	public Client getClient(String id) {
		// TODO Query in Database
		return null;
	}

	@Override
	public Sale getSale(String id) {
		// TODO Query in Database
		return null;
	}

	@Override
	public void updateStock(String productId, Integer value) {
		// TODO update in Database
		
	}



}
