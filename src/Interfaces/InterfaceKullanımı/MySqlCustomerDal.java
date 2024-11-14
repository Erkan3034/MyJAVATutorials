package Interfaces.InterfaceKullanımı;

public class MySqlCustomerDal implements ICustomerDal {
	@Override
	public void Add() {

		System.out.println("MySQL  added succesfully ! ");
	}
}
