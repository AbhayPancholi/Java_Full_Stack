class Mininarray{
public static void main(String[] ar){
int[] arr = {10,2,5,48,20,55,1};
int min = arr[0];

for(int i=0;i<arr.length;i++){
if(arr[i]<min){
min = arr[i];}
}

System.out.println(min);
}
}