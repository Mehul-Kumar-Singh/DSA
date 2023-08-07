import java.util.ArrayList;
import java.util.Arrays;

public class rearranging_array_into_positive_and_negative_variety_2 {
  public static int[] rearrange(int[] a) {
	  int n = a.length;
	  ArrayList<Integer> pos = new ArrayList<>();
	  ArrayList<Integer> neg = new ArrayList<>();
	  for(int i=0;i<n;i++) {
		  if(a[i] >= 0) {
			  pos.add(a[i]); // 1 5 6 6 7 8
		  }
		  else {
			  neg.add(a[i]);
		  }
	  }
	  
	  int[] b = new int[n];
	  if(pos.size() > neg.size()) { // -2 -4
		  int i;
		  for(i=0;i<neg.size();i++) {  // means 1 -2 5 -4
			  b[2*i] = pos.get(i);
			  b[2*i+1] = neg.get(i);
		  }
		  int index = 2 * neg.size();
		  while(index<n) {
			  b[index] = pos.get(i);
			  i++;
			  index++;
		  }
	  }
	  else {
		  int i;
		  for(i=0;i<pos.size();i++) {  
			  b[2*i] = pos.get(i);
			  b[2*i+1] = neg.get(i);
		  }
		  int index = 2 * pos.size();
		  while(i<n) {
			  b[index] = neg.get(i);
			  i++;
			  index++;
		  }
	  }
	  return b;
  }
	public static void main(String[] args) {
		int[] a = {-2,1,5,6,-4,90,7,8}; 
		int[] result = rearrange(a);
        System.out.println(Arrays.toString(result));
	}

}
