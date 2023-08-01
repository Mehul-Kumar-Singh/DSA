import java.util.Arrays;

public class Find_first_and_last_occurence_of_target_in_an_Sorted_array {
      public static int[] find_first_and_last(int[] a, int target) {
    	  int[] ans = {-1,-1};
    	  int start = search(a,target,true);
    	  int last  = search(a,target,false);
    	  ans[0] = start;
    	  ans[1] = last;
    	  return ans;
      }
      static int search(int[] a, int target, boolean FindingStartIndex) {
    	  int ans = -1;
    	  int start = 0;
    	  int end   = a.length-1;
    	  while(start <= end) {
    		  int mid = start + (end - start) / 2;
    		  if(a[mid] == target) {
    			  ans = mid; // potential index found
    			  // now two conditions finding which occurence
    			  if(FindingStartIndex) { // finding first occurence
    				  end = mid - 1;
    			  }
    			  else {  // finding last occurence
    				  start = mid + 1;
    			  }
    		  }
    		  else if(a[mid] < target) {
    			  start = mid + 1;
    		  }
    		  else {
    			  end = mid - 1;
    		  }
    	  }
    	  return ans;
      }
	public static void main(String[] args) {
		int[] a = {1,2,3,3,3,4,5,6};
		int target = 3;
		int[] result = find_first_and_last(a,target);
		System.out.println(Arrays.toString(result));

	}
}
