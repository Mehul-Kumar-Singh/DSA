// rotate one element to the right
import java.util.Arrays;
public class Rotate_right{
 public static void right_rotate(int[] a){ 
  int first_element = a[a.length-1];
  int i;
 for(i=a.length-1;i>0;i--){
   a[i] = a[i-1]; 
  }
 a[0] = first_element; 
 }
 public static void main(String[] args){
 int[] a = {1,2,3,4,5};
System.out.println(Arrays.toString(a));
 right_rotate(a);
 System.out.println(Arrays.toString(a));
 } 
}