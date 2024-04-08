class Testcmd{

public static void main(String[] ar){

String s1 = ar[0];
String s2 = ar[1];
System.out.println(s1+" "+s2);
//while running this file, provide 2 values as input like this:
//>>java Testcmd hello world

int a = Integer.parseInt(s1);
int b = Integer.parseInt(s2);
System.out.println(a+b);

}
}