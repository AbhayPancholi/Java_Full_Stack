package test2;

interface Messagable1{
	Message getMessage(String message);
}


class Message {
	
	Message(String message){
		System.out.println(message);
	}

}

public class Constructorref1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Messagable1 m1 = Message::new;
		m1.getMessage("hi all");
	}

}
