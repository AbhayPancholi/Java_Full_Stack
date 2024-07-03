package spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
		
		Trainee trainee1=context.getBean("trainee1",Trainee.class);
		trainee1.displayTraineeDetails(); 
		Trainee trainee2=context.getBean("trainee2",Trainee.class);
		trainee2.displayTraineeDetails();
		
	}

}
