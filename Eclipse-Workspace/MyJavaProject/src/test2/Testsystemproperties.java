package test2;

public class Testsystemproperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//immutable read only map
		//getEnv is OS level-operationg system variables
		//getProperties is java level-jvm arguments
		//we use -d to set java properties
		
		System.out.println(System.getenv("PATH"));
		
		System.out.println(System.getenv("TEMP"));
		
		System.out.println(System.getenv("USERNAME"));
		
		

	}

}
