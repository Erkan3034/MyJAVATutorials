package Oop_kısmı.Getter_Setter;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		
		product.setId(1);
		product.set_name("ACER");
		product.set_price(1520);
		product.set_renk("kırmızı");
		product.set_stockAmount(5);
		
		System.out.println(product.get_kod());

	}

}
