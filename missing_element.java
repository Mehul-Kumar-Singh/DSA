// find missing element from 1 to N
public class missing_element{ 
  public static int missing(int[] a, int N){
    int total = 0;
   for(int i=0;i<a.length;i++){
       total += a[i];
    }
     int sum=(N*(N+1))/2;
   return sum-total;
 }
public static void main(String[] args){
   int[] a = {1,2,3,4,5,6,7,9,10};
   int N = 10;
   int res = missing(a,N);
   System.out.println(res);
 }
} 