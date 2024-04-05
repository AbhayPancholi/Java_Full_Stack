/*In this example we are trying to access the files form the package using command line*/

/*
C:\Users\ABHAY>d:

D:\>cd package1

D:\package1>javac One.java

D:\package1>java One
Error: Could not find or load main class One

D:\package1>java One.java
Error: Could not find or load main class One.java

D:\package1>java package1.One
Error: Could not find or load main class package1.One

D:\package1>set classpath=%classpath%;d:\;.;

D:\package1>java package1.One
6

D:\package1>
*/

package package1;

public class One{
protected void add(int a){
a++;
System.out.println(a);}

public static void main(String[] ar){
One b = new One();
b.add(5);
}
}