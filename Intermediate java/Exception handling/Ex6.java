//Exception handling using throw mehtod

class Ex6{

static void div(int a, int b){
try{
System.out.println(a/b);}
catch(ArithmeticException e){
System.out.println("2nd value must be a non zero number");
throw e;}}

public static void main(String[] args){

int a = 0;
int b = 0;

try{
String s1 = args[0];
String s2 = args[1];

a = Integer.parseInt(s1);
b = Integer.parseInt(s2);

System.out.println(a+b);
//System.out.println(a/b);

}catch(ArrayIndexOutOfBoundsException e){
System.out.println("Please enter any two values.\nWe got an exception: "+e);}
catch(NumberFormatException e1){
System.out.println("Please enter only numbers.\nWe got an exception: "+e1);}
catch(ArithmeticException e2){
System.out.println("2nd values must be a non zero number.\nWe got an exception: "+e2);}

//Modifying file by adding try catch here
try{
div(a,b);}
catch(ArithmeticException e){
System.out.println("2nd number must be non zero");
}finally{System.out.println("code execution completed");}
}}