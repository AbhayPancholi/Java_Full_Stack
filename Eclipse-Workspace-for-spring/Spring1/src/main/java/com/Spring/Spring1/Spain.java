package com.Spring.Spring1;

public class Spain  implements Tour{
	public Spain() {
		System.out.println("Object for spain class created successfully");
	}

	@Override
	public void fare() {
		// TODO Auto-generated method stub
		System.out.println("4500");
	}

	@Override
	public void distance() {
		// TODO Auto-generated method stub
		System.out.println("6500 miles");
	}
}
