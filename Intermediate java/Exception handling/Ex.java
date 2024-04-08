class Ex{

public static void main(String[] args){

try{
String s1 = args[0];
String s2 = args[1];

int a = Integer.parseInt(s1);
int b = Integer.parseInt(s2);

System.out.println(a+b);
System.out.println(a/b);
}catch(Exception e){
System.out.println("Please input two valid numbers to add and divide\n We got an exception: "+e);
}
}

}