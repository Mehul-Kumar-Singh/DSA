// [1,2,2,3,4,5,5]
// remove duplicate elements (in palce)
import java.util.Arrays;
public class remove_duplicate{
 public static int[] remove(int[] a){
  int j = 0,i;
  for(i=0;i<a.length-1;i++){ 
   if(a[i] != a[i+1]) { 
       a[j] = a[i];
       j++;
     }
  }
  a[j++] = a[i];
  while(j<=i){
   a[j] = 0;
     j++; 
  }
 return a;
 } 
public static void main(String[] args){
  int[] a = {1,1,1,2,2,3,3,3};
   System.out.println(Arrays.toString(a));
   int[] ans = remove(a);
   System.out.println(Arrays.toString(ans));
 }
}