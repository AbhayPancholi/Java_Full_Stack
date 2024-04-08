//Exception handling using multiple catch blocks

class Ex2{

public static void main(String[] args){

try{
String s1 = args[0];
String s2 = args[1];

int a = Integer.parseInt(s1);
int b = Integer.parseInt(s2);

System.out.println(a+b);
System.out.println(a/b);
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("Please enter any two values.\nWe got an exception: "+e);}
catch(NumberFormatException e1){
System.out.println("Please enter only numbers.\nWe got an exception: "+e1);}
catch(ArithmeticException e2){
System.out.println("2nd values must be a non zero number.\nWe got an exception: "+e2);}
finally{
System.out.println("Code execution completed");}
}}