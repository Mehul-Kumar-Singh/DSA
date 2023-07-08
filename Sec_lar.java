// Second largest element and Second smallest element
import java.lang.Math;
import java.util.Arrays;
public class Sec_lar{
 public static int second_largest(int[] a){
  int max=Integer.MIN_VALUE;
  int sec_max = Integer.MIN_VALUE;
  for(int i=0;i<a.length;i++){
   if(a[i] > max){
        sec_max = max;
        max = a[i];
     } 
   else if(sec_max<a[i] && a[i] != max){
        sec_max = a[i];
     }
   } 
   return sec_max;
}
public static void main(String[] args){
  int[] a = {34,24,6,254,5734,1453};
    System.out.println(Arrays.toString(a));
    
  int res = second_largest(a);
   System.out.println("Second largest element: " +res);
}
}