import java.util.HashMap;

public class get_common_elements_2 { // contains duplicate
   public static void find_common_elements(int[] a,int[] b) {
	   HashMap<Integer,Integer> hmap = new HashMap<>();
	   for(int i=0;i<a.length;i++) {
//		   hmap.put(a[i],hmap.getOrDefault(a[i],0)+1);
		   if(hmap.containsKey(a[i])){
			   int old_f = hmap.get(a[i]);
			   int new_f = old_f + 1;
			   hmap.put(a[i],new_f);
		   }
		   else {
			   hmap.put(a[i],1);
		   }
	   }
	   // now iterate through the second array
	   for(int element : b) {
		   if(hmap.containsKey(element) && hmap.get(element)>0) {
				   System.out.print(element+ " ");
				   int old_f = hmap.get(element);
				   int new_f = old_f - 1;
				   hmap.put(element,new_f);
		   }
	   }
   }
   
	public static void main(String[] args) {
     int[] a = {1,1,2,2,2,3,5};
     int[] b = {1,1,1,2,2,4,5};
     find_common_elements(a,b);
	}

}
