class ExamPassFail{

public static void main(String[] ar){
try{
String mymarks=ar[0];
int marks = Integer.parseInt(mymarks);
if(marks < 40){
throw new PassFailException(mymarks);
}else{System.out.println("You are pass");}
}catch(PassFailException e){
System.out.println("You are not qualified:"+e+"\n");}
catch(ArrayIndexOutOfBoundsException e1){
System.out.println("Please enter a value");
}
}
}
