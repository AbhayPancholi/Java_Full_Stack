class Maxinarray{

public static void main(String[] ar){

int[] arr = {10,2,5,48,20,55,1};
int max = arr[0];

for(int i=0;i<arr.length;i++){

if(arr[i]>max){
max = arr[i];
}
}
System.out.println(max);
}
}