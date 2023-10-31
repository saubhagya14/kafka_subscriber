package ed.api_config_server.model;

public class Order {

	private Integer id;
	private double price;
	private String email;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", price=" + price + ", email=" + email + "]";
	}
	
	
}
