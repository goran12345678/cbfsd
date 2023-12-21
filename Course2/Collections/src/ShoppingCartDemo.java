
import java.util.ArrayList;

public class ShoppingCartDemo {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hi all");
		list.add("Next element");
		list.remove("Next element");
		//System.out.println(list);
		
		Product p1 = new Product(101, "Adidas AlphaBounce Shoe", 2000, 0);
		Product p2 = new Product(201, "iPhone 11", 60000, 0);
		Product p3 = new Product(301, "Samsung LED TV", 5000, 0);
		Product p4 = new Product(401, "Hitachi Fridge", 80000, 0);
		Product p5 = new Product(501, "Coffee Mug", 200, 0);
		
		User user1 = new User("John","john@gmail.com");
		User user2 = new User("Fionna","fionna@yahoo.com");
		
		user1.addProductToCart(p1);
		user1.addProductToCart(p2);
		user1.addProductToCart(p3);
		
		user2.addProductToCart(p4);
		user2.addProductToCart(p5);
		
		user1.removeProductFromCart(p2);
		
		user1.showProductsInCart();


	}
*/
}
class Product{
	
	int pid;
	String name;
	int price;
	int quantity;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int pid, String name, int price, int quantity) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}

class User{
	
	String name;
	String email;
	
	ArrayList<Product> shoppingCart;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
		shoppingCart = new ArrayList<Product>();
	}
	
	void addProductToCart(Product product){
		product.quantity++;
		shoppingCart.add(product);
	}
	
	void increment(Product product) {
		int idx = shoppingCart.indexOf(product);
		if(idx>0)
			shoppingCart.get(idx).quantity++;
		
	}
	
	void decrement() {
		// write decrement for quantity here
	}
	
	void removeProductFromCart(Product product) {
		int idx = shoppingCart.indexOf(product);
		shoppingCart.remove(idx);
	}
	
	void showProductsInCart() {
		System.out.println("Listing Products for "+name);
		
		for(Product product : shoppingCart) {
			System.out.println(product);
		}
		
		System.out.println();
	}
	
	void checkOutFromCart() {
		
		System.out.println("Checking Out for "+name);
		
		int total = 0;
		
		for(Product product : shoppingCart) {
			System.out.println(product);
			total += (product.price*product.quantity);
		}
		
		System.out.println("Dear, "+name+ " Please Pay: "+total);
		System.out.println();
	}
	
	
}

