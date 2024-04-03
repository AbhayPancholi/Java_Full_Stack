//methods statoic mehtod with return type

class teststatic2{
static int add(int a){
a++;
return a;}


public static void main(String[] args){
int sum = add(100);
System.out.println(sum);
int res = teststatic2.add(200);
System.out.println(res);
}}

//main() calls add() method - calling method is main add() is called //method
//called method will not return any value to the calling method