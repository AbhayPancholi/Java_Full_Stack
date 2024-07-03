package spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComponent1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		Friends myfriend = context.getBean("myfriends", Friends.class);
		myfriend.display();
		Friends myfriend1 = context.getBean("myfriends", Friends.class);
		myfriend1.display();
		
	}
}
