import java.util.HashMap;

public class longest_subarray_of_0_and_1 {
	public static int maxLen(int[] a, int N)
    {
       HashMap<Integer,Integer> hmap = new HashMap<>();
       hmap.put(0,-1);
       int len=0;
       int sum=0;
       for(int i=0;i<N;i++){
           if(a[i] == 1){
               sum += 1;
           }
           else{
               sum += -1;
           }
           if(hmap.containsKey(sum)){
               len = Math.max(len, (i - hmap.get(sum)));
           }
           else{
               hmap.put(sum,i);
           }
       }
       return len;
    }
	public static void main(String[] args) {
    int[] a = {0,1,0,1};
    int n = a.length;
    int result = maxLen(a,n);
    System.out.println("Maximum length subarray: " +result);
    
	}

}
