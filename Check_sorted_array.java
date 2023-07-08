// Check whether given array is sorted or not.
public class Check_sorted_array{
 public static boolean sorted(int[] a){
   for(int i=1;i<a.length;i++){
     if(a[i] < a[i-1]){
       return false;
     }
   }
   return true;
 }
public static void main (String[] args){
  int[] a = {1,3,5,62,65};
  if(a.length == 0){
     System.out.println("Insert number!!!!");
      return ;
   }
  if(a.length < 2){
     System.out.println("Sorted array as only 1 element is present.");
      return ;
   }
  boolean flag = sorted(a);
  if(flag)
    System.out.println("Sorted array");
 else 
   System.out.println("Unsorted array");
 }
}