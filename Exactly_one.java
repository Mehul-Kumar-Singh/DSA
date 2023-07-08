// Find the number that appears once, and the other numbers twice
public class Exactly_one{
  public static int appeared_only_once(int[] a){
    int ans = 0;
   for(int i=0;i<a.length;i++){
      ans ^= a[i];
    }
    return ans;
  }
public static void main(String[] args){
  int[] a = {1,1,2,2,3,4,4,5,5};
  int res = appeared_only_once(a);
  System.out.println(res);
 }
} 