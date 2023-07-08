// SORT 0,1 AND 2
/* Given an array nums with n objects colored red, white, or blue, sort them in-place so that
   objects of the same color are adjacent, with the colors in the order red, white, and blue.
   We will use the integers 0, 1, and 2 to represent the color red, white, and blue,
   respectively.*/

/* DUTCH NATIONAL FLAG ALGO-->
          This algorithm contains 3 pointers i.e. low, mid, and high, and 3 main rules.  The rules are the following:
                   ----> arr[0….low-1] contains 0. [Extreme left part]
                   ----> arr[low….mid-1] contains 1.
                   ----> arr[high+1….n-1] contains 2. [Extreme right part], n = size of the array
                   ----> The middle part i.e. arr[mid….high] is the unsorted segment.  
*/



import java.util.Arrays;
public class Sort_0_1_2_optimised{

// NAIVE APPROACH --> using three variables --> T.C --> O(N)
  public static void calculation(int[] a){
       int count_0=0;
       int count_1=0;
       int count_2=0;
         
      for(int i=0;i<a.length;i++){
         if(a[i] == 0){
             count_0++; 
           }
        else if(a[i] == 1){
              count_1++;
            }
         else{
              count_2++;
            }
         }
          int i;
       for(i=0;i<count_0;i++){
             a[i] = 0;
          }
        for(;i<count_0 + count_1;i++){ 
              a[i] = 1;
           }

        for(; i<count_0 + count_1 + count_2;i++){
              a[i] = 2;
          }
     }

// OPTIMISED APPROACH --> DUTCH NATIONAL FLAG ALGO
 public static void calculation_optimised(int[] a){
    // initially
   int low=0;
   int mid = 0;
   int high = a.length-1;
   while(mid<=high){
       if(a[mid] == 2){
         // swap mid and high element
           swap(a,a[mid],a[high]);
            high--;    
         }
       else if(a[mid] == 1){
             mid++;
          }
        else{
             swap(a,a[low],a[mid]);
             low++;
              mid++;
               }  
        }
   }
  public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
 public static void main(String[] args){
   int[] a = {2,0,2,1,1,0};  // 0,0,1,1,2,2
System.out.println(Arrays.toString(a));
   calculation_optimised(a);
  System.out.println(Arrays.toString(a));
 }
}