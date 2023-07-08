// rotate one element to the left 
import java.util.Arrays;
public class Rotate_left{
 public static void left_rotate(int[] a){ 
  int first_element = a[0];
  int i;
 for(i=1;i<a.length;i++){
   a[i-1] = a[i]; 
  }
 a[i-1] = first_element; 
 }
 public static void main(String[] args){
 int[] a = {1,2,3,4,5};
System.out.println(Arrays.toString(a));
 left_rotate(a);
 System.out.println(Arrays.toString(a));
 } 
}