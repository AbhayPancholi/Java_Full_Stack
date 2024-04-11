//Custom exception

class InvalidAgeException extends Exception{
String ex;

InvalidAgeException(String myex){
this.ex = myex;
System.out.println("InvalidAgeException object created");

System.out.println("Invalid age please check" + this.ex);
}

public String toString(){
return "This is an instance of InvalidAgeException: "+this.ex;
}
}