class Testtype{
public static void main(String[] ar){

byte b1 = 12;
byte b2 = 13;
byte sum = b1+b2;//this line will cause an error as the sum of two bytes //becomes an integer, the addition could not take place as byte value is //goes above 128 and the range of bytes is -128 to 127.
}
}