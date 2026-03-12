package pack;
public class max{
public int findmax(int arr[]){
int max = arr[0];
for(int i=0;i<arr.length;i++){
   if(arr[i]>max){
max = arr[i];
}
}
return max;
}
}