package database;

import main.Client;
import main.Product;
import main.Sale;

public class DatabaseProxy implements DatabaseInterface{
	private Database service;
	private String permisionCode;
	
	
	public DatabaseProxy(String permisionCode) {
		this.service = Database.getInstance();
		this.permisionCode= permisionCode;
	}

	@Override
	public boolean addProduct(Product p) {
			if(permisionCode is valid) {
		
			return this.service.addProduct(p);
			}
			return false;
	}

	@Override
	public boolean addClient(Client c) {
		if(permisionCode is valid) {
			
			return this.service.addClient(c);
			}
			return false;
		
	}

	@Override
	public boolean addSale(Sale s) {
		if(permisionCode is valid) {
			
			return this.service.addSale(s);
			}
			return false;
		
	}

	@Override
	public Product getProduct(String id) {
		if(permisionCode is valid) {
			return this.service.getProduct(id);
		}
		return null;
		
		
	}

	@Override
	public Client getClient(String id) {
		if(permisionCode is valid) {
		return this.service.getClient(id);
		}
		return null;
	}

	@Override
	public Sale getSale(String id) {
		if(permisionCode is valid) {
		return this.service.getSale(id);
		}
		return null;
	}

	@Override
	public void updateStock(String productId, Integer value) {
		if(permisionCode is valid && this.service.getProduct(productId)!=null) {
			this.service.updateStock(productId, value);
		}
		
		
	}

}
