// TWO SUM PROBLEM
import java.util.Arrays;
import java.util.HashMap;
public class two_sum{

// Method-1) NAIVE APPROACH (T.C --> O(N^2))
 public static int[] cal_using_two_for_loops(int[] a, int target){
 for(int i=0;i<a.length-1;i++){
    for(int j=i+1;j<a.length;j++){
       if(a[i]+a[j]==target){
             return new int[]{i,j};
            }
     }
   }
   return new int[]{-1,-1};
}

// METHOD-2) BETTER APPROACH (T.C--> O(N) S.C--> O(N))
public static int[] cal_using_extra_space(int[] a,int target){
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

// METHOD-3) BETTER APPROACH BUT WITH LESS SPACE(SORTING) (T.C-->O(NLOGN) S.C--> O(1))
    public static int[] cal_using_two_pointers(int[] a,int target){
    Arrays.sort(a);
    int left=0;
    int right=a.length-1;
    while(left < right){
          int sum = a[left] + a[right];
           if(sum > target){
              right--;
           }
           else if(sum < target){
              left++;
           }
           else{
               return new int[]{left,right};
               }
       } 
      return new int[]{-1,-1};
    }

public static void main(String[] args) {
 int[] a ={1,5,6,15,22};
 int target = 20;
 int[] ans =  cal_using_two_pointers(a,target);
 System.out.println(Arrays.toString(ans));
  }
 }