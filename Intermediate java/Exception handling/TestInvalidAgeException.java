class TestInvalidAgeException{

public static void main(String[] ar){
String myage=ar[0];
int age = Integer.parseInt(myage);
try{
if(age < 17){
throw new InvalidAgeException(myage);
}
}catch(InvalidAgeException e){
System.out.println("Entered age is not valid one:"+e);}
}
}
