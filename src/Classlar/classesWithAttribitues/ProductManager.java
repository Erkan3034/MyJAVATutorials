package Classlar.classesWithAttribitues;

public class ProductManager {

	public void Add(Product product) {
		System.out.println("Product added! = " + product.name);
	}
	
	public void Delete(Product product) {
		System.out.println("Product deleted! = " + product.name);
	}
	
	public void Updated(Product product) {
		System.out.println("Product updated! = " + product.name);
	}
	
}
