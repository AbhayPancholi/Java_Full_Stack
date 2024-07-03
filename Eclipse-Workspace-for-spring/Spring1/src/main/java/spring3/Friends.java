package spring3;

import org.springframework.stereotype.Component;

@Component("myfriends")
public class Friends {
	public Friends() {
		System.out.println("Public object created");
	}
	
	public void display() {
		System.out.println("Friends accross globe");
	}
}
