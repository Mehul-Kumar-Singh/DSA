//TWO SUM PROBLEM
import java.util.HashMap;
import java.util.Arrays;
public class Two_Sum_optimised{

  public static int[] cal(int[] a,int target){
   HashMap<Integer,Integer> hmap = new HashMap<>();
    // select element one by one
    for(int i=0;i<a.length;i++){
     // checking whether other element(target-a[i]) is present or not
       if(hmap.containsKey(target-a[i])){
           return new int[]{hmap.get(target-a[i]),i};
          }
       hmap.put(a[i],i);
    }
     return new int[]{-1,-1};
   }
public static void main(String[] args){
   int[] a = {2,3,1,4};
   int target = 4;
   int[] res = cal(a,target);
   System.out.println(Arrays.toString(res));
}
}