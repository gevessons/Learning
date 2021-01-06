package entities;

public class Product {
	
	private String name;
	private String email;
	private double room;
	
	public Product(String name, String email, double room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public double getRoom() {
		return room;
	}

}
