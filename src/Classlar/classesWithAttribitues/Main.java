package Classlar.classesWithAttribitues;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		
		product.Id=1;
		product.name="ACER";
		product.description="Acer laptop";
		product.price=13500;
		product.stockAmount=5;
		
		System.out.println(product.name + " " + product.price);
		
		
		System.out.println();
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		productManager.Updated(product);
		
		

	}

}
