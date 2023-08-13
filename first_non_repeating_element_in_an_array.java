import java.util.HashMap;

public class first_non_repeating_element_in_an_array {
     public static int find_first_non_repeating(int[] a) {
    	 HashMap<Integer,Integer> hmap = new HashMap<>();
    	 for(int element : a) {
    		 if(hmap.containsKey(element)) {
    			 int prev_freq = hmap.get(element);
    			 int curr_freq = prev_freq + 1;
    			 hmap.put(element, curr_freq);
    		 }
    		 else {
    			 hmap.put(element, 1);
    		 }
    	 }
    	 
    	 for(int i=0;i<a.length;i++) {
    		 if(hmap.get(a[i])==1) {
    			 return a[i];
    		 }
    	 }
    	 return 0;
     }
	public static void main(String[] args) {
   int[] a = { -1, 2, 6, 3, 2, 10,-1,10};
   int result = find_first_non_repeating(a);
   System.out.println(result);
   }

}
