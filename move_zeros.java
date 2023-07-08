// move zeros to the end
import java.util.Arrays;
public class move_zeros{
public static void move_0(int[] a){
  int count=0;
  int j=0;
  for(int i=0;i<a.length;i++){
   if(a[i]!=0){
    a[j] = a[i];
    j++;
   }
    else{
      count++;
    }
  }
  while(count > 0){
   a[j] = 0;
   j++;
   count--;
  }
 }
public static void main(String[] args){
 int[] a ={1, 0, 0, 0, 0, 0, 4, 1};
System.out.println(Arrays.toString(a));
 move_0(a);
System.out.println(Arrays.toString(a));

 }
} 