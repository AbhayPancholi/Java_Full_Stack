class TestString1{
public static void main(String[] ar){
String s1 = "hello";
String s2 = "hello";

System.out.println("s1 is: "+s1);
System.out.println("s2 is: "+s2);

System.out.println(s1.hashCode());
System.out.println(s2.hashCode());

s1 = s1+"hai";
s2 = s2+"hi";

System.out.println("s1 is: "+s1);
System.out.println("s2 is: "+s2);

char[] ss = s1.toCharArray();
System.out.println(ss.length);

/*Hello will be refernced by s1 and s2 when you change the value of s2 it will not append the value of as it is ref by s1 and s2 so new object with new value hellohai will be created and ref by s1 */
}}