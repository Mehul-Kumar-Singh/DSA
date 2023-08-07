import java.util.Arrays;

public class rearranging_array_into_positive_and_negative_variety_1 {
  public static int[] rearrange_brute(int[] a) {
	  int[] pos = new int[a.length/2];
	  int j=0;
	  int[] neg = new int[a.length/2];
	  int k=0;
	  for(int i=0;i<a.length;i++) {
		  if(a[i] >= 0) {
			  pos[j]  = a[i];
			  j++;
		  }
		  else {
			  neg[k]  = a[i];
			  k++;
		  }
	  }
	  // now insert
	  for(int i=0;i<a.length/2;i++) {
		  a[2*i] = pos[i];
		  a[2*i+1] = neg[i];
	  }
	  return a;
  }
	public static int[] rearrange_optimized(int[] a){
	  int n = a.length;
	  int[] b = new int[n];
	  int even_index = 0;
	  int odd_index  = 1;
	  for(int i=0;i<n;i++) {
		  if(a[i]>=0) {
			  b[even_index] = a[i];
			  even_index += 2;
		  }
		  else {
			  b[odd_index] = a[i];
			  odd_index += 2;
		  }
	  }
	  return b;
  }
	public static void main(String[] args) {
		int[] a = {1,-2,-4,5};
		int[] ans = rearrange_brute(a);
		System.out.println(Arrays.toString(ans));
		int[] result = rearrange_optimized(a);
		System.out.println(Arrays.toString(result));
	}
}
