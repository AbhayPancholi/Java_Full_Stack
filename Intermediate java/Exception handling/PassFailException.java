class PassFailException extends Exception{
String ex;

PassFailException(String myexp){
this.ex = myexp;
System.out.println("PassFailException Object created");
System.out.println("Better luck next time!"+this.ex);
}

public String toString(){
return "This is an instance of PassFailException: "+this.ex;
}
}