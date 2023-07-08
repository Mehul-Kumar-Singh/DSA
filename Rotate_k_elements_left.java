// rotate k elements to the left 

import java.util.Arrays;
public class Rotate_k_elements_left{
 // Method-1)
 public static void left_rotate(int[] a, int k){ 
   while(k>0){
   int first_element = a[0];
    int i;
   for(i=1;i<a.length;i++){
     a[i-1] = a[i];
      }
   a[i-1] = first_element;
    k--;
   }
  }
 // Method-2) using reverse 
  public static void left_rotate_m2(int[] a,int k){
    reverse(a,0,k-1);
    reverse(a,k,a.length-1);
    reverse(a,0,a.length-1);
  } 
  public static void reverse(int[] a,int low, int high){
     while(low < high){
          int temp = a[low];
          a[low] = a[high];
          a[high] = temp;
          low++;
          high--;
     }
   }

 public static void main(String[] args){
 int[] a = {1,2,3,4,5};
  int k = 55;
System.out.println(Arrays.toString(a));
 left_rotate_m2(a,k%a.length);
 System.out.println(Arrays.toString(a));
 } 
}