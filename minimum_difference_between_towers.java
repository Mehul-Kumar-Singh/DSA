import java.util.Arrays;

public class minimum_difference_between_towers {
	private static int getMinDiff(int[] a, int n, int k) {
        Arrays.sort(a);
        int temp_min = a[0];
        int temp_max = a[n-1];
		int res = temp_max - temp_min;
        for(int i=1;i<n;i++) {
        	if(a[i] - k < 0) {
        		continue;
        	}
        	temp_max = Math.max(a[i-1]+k, a[n-1]-k);
        	temp_min = Math.min(a[i]-k,a[0]+k);
            res = Math.min(res, temp_max - temp_min);
        }
        return res;
    }
      public static void main(String[] args) {
    	  int[] a = {1,2,3,4,5};
    	  int k=2;
    	  int n = a.length;
    	  int ans  = getMinDiff(a,n,k);
    	  System.out.println(ans);
      }
}
