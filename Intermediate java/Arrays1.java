class Arrays1{
public static void main(String[] ar){
int[] marks={98,95,100,91,87};
System.out.println(marks.length);
int total=0;
System.out.println("----sum of elements---");

for(int i=0;i<marks.length;i++){
total+=marks[i];
System.out.println(total);
}
System.out.println("----traverse---");

System.out.println(total);
for(int i=0;i<marks.length;i++){
System.out.println(marks[i]);
}
System.out.println("----reverse----");
for(int i=marks.length-1;i>=0;i--){
System.out.println(marks[i]);
}
}
}