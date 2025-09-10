package com.tcf.package_proj;

public class ShoppingExecuter {

	public static void main(String[] args) {
		
		ShoppingMall s = new Food();
		Customer c1 = new Customer(11,"Rahul","pondy",s) ;
		System.out.println(c1);
		c1.order();
	}

}
