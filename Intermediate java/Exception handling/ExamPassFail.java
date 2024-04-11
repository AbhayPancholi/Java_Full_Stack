class ExamPassFail{

public static void main(String[] ar){
String mymarks=ar[0];
int marks = Integer.parseInt(mymarks);
try{
if(marks < 40){
throw new PassFailException(mymarks);
}else{System.out.println("You are pass");}
}catch(PassFailException e){
System.out.println("You are not qualified:"+e);}
}
}
