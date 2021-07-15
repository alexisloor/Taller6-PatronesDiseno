package database;

import main.*;

public interface DatabaseInterface {
	public boolean addProduct(Product p);
	public boolean addClient(Client c);
	public boolean addSale (Sale s);
	
	public Product getProduct(String id);
	public Client getClient(String id);
	public Sale getSale(String id);
	public void updateStock (String productId, Integer value);

}
