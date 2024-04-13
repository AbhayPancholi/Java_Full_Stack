class Testtype{
public static void main(String[] ar){

byte b1 = 12;
System.out.println("b1 is: "+b1);
byte b2 = 13;
System.out.println("b2 is: "+b2);
//byte sum = b1+b2;
//this line will cause an error as the sum of two bytes becomes an //integer, the addition could not take place as byte value is goes above //128 and the range of bytes is -128 to 127.

int sum = b1+b2;
System.out.println("The sum of b1 and b2 is: "+sum);
}
}