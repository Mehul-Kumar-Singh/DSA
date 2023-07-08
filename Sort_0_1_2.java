// SORT 0,1 AND 2
/* Given an array nums with n objects colored red, white, or blue, sort them in-place so that
   objects of the same color are adjacent, with the colors in the order red, white, and blue.
   We will use the integers 0, 1, and 2 to represent the color red, white, and blue,
   respectively.*/

import java.util.Arrays;
public class Sort_0_1_2{
  public static int[] calculation(int[] a){
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
       for(int i=0;i<count_0;i++){
             a[i] = 0;
          }
        for(;i<count_1;count_1++){ 
              a[i] = 1;
           }
        for(; i<count_2;count_2++){
              a[i] = 2;
          }
        return a[];

     }
 public static void main(String[] args){
   int[] a = {2,0,2,1,1,0};
  int[] res = calculation(a);
  System.out.println(Arrays.toString(res));
 }
}