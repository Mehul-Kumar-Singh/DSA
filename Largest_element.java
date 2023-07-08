import java.lang.Math;
import java.util.Arrays;
public class Largest_element{
 public static int largest_element(int[] a){
  int largest  = a[0];
  for(int element : a){
   if(element > largest)
      largest = element;
  }
   return largest; 
 }

public static void main(String[] args){
 // generating 5 random numbers
 int[] a = new int[5];
 for(int i=0;i<a.length;i++){
   a[i] = (int)(Math.random()*10);
  }

  System.out.println(Arrays.toString(a));
 
 int res = largest_element(a);
 System.out.println("Largest element is: " +res);
}
}