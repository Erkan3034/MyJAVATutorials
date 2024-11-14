package Oop_kısmı.Getter_Setter;

public class Product {

	// attribute || field

	private int _Id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;

	// Getter metodları

	public int getId() {
		return _Id;
	}

	// Setter metodları
	public void setId(int Id) {
		_Id = Id;
	}

	
	public String get_kod() {
		return this._name.substring(0,4) + " " + _Id; //setter vermeyerek kullanıcının girmesini engelledik.
	}



	
	
	
	public String get_renk() {
		return _renk;
	}

	public void set_renk(String renk) {
		_renk = renk;
	}

	
	
	
	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int stockAmount) {
		_stockAmount = stockAmount;
	}

	
	
	
	public double get_price() {
		return _price;
	}

	public void set_price(double price) {
		_price = price;
	}
	
	
	

	public String get_description() {
		return _description;
	}

	public void set_description(String description) {
		_description = description;
	}

	
	
	
	public String get_name() {
		return _name;
	}

	public void set_name(String name) {
		_name = name;
	}
}
