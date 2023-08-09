import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

public class get_common_elements_1 { // answer should not contain duplicates
  public static void find_common_element(int[] a,int[] b) {
//	  <--- METHOD-1 --->Using HashSet
//	  HashSet<Integer> set = new HashSet<>();
//	  for(int element : a) {
//		  set.add(element);
//	  }
//	  for(int element : b) {
//		  set.add(element);
//	  }
//	  System.out.println(set);
	  
//	  <--- METHOD-2 ---> using two pointers use when arrays are already sorted
	  int i = 0;
	  int j = 0;
	  ArrayList<Integer> al = new ArrayList<>();
	  while(i<a.length && j<b.length) {
		  if(a[i] == b[j]) {
			  if(!al.contains(a[i])) {
			  al.add(a[i]);
			  }
			  i++;
			  j++;
		  }
		  else if(a[i] > b[j]) {
			  j++;
		  }
		  else {
			  i++;
		  }
	  }
	 System.out.println(al);  
	  
//	  <--- METHOD-3 ---> Using HashMap 
//	  HashMap<Integer,Integer> hmap = new HashMap<>();
//	  for(int i=0;i<a.length;i++) {
//		  hmap.put(a[i],hmap.getOrDefault(a [i],0)+1);
//	  }
//	  // now loop through the keys and check whether key is present in the array a or not
////	  Set<Integer> set = hmap.keySet();
//	  for(int element : b) {
//		  // check whether array a element is present in the hmap or not
//	     if(hmap.containsKey(element)) {
//	    	 System.out.print(element+ " ");
//	    	 hmap.remove(element);
//	     }	 
//	     }
//	 
  }
	public static void main(String[] args) {
		int[] a = {1,1,2,2,2,3,5};
		int[] b = {1,1,1,2,2,4,5};
		find_common_element(a,b);
	}
}
