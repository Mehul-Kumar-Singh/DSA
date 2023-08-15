import java.util.HashMap;

public class find_number_of_subarrays_having_equal_number_of_0_and_1 {
	static int countSubarrWithEqualZeroAndOne(int a[], int n)
    {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,1);
         int sum = 0;
         int count = 0;
	     for(int i=0;i<n;i++){
	         if(a[i] == 1){
	             sum += 1;
	         }
	         else{
	             sum += -1;
	         }
	         if(hmap.containsKey(sum)){
	             count += hmap.get(sum);
	             hmap.put(sum,hmap.get(sum)+1);
	         }
	         else{
	             hmap.put(sum,1);
	         }
	     }
	   return count;
    }
	public static void main(String[] args) {
		int[] a = {1,0,0,1,0,1,1};
		int n = a.length;
		int result = countSubarrWithEqualZeroAndOne(a, n);
		System.out.println(result);
	}

}
