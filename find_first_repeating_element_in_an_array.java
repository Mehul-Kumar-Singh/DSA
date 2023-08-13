import java.util.HashMap;
public class find_first_repeating_element_in_an_array {
	public static int first_repeating_element(int[] a,int n) {
	int first_repeating_element_index=n;
    HashMap<Integer,Integer> hmap = new HashMap<>();
    boolean occured = false;
    for(int i=0;i<n;i++){
        if(hmap.containsKey(a[i])){
             first_repeating_element_index = Math.min(first_repeating_element_index, hmap.get(a[i]));
             occured = true;
        }
        else{
            hmap.put(a[i],i);
        }
    }
    
    if(occured == false){
        return -1;
    }
    return first_repeating_element_index+1;
	}
	
	public static void main(String[] args) {
      int[]  a = { 10, 5, 3, 4, 3, 5, 6};
      int n = a.length;
      int result = first_repeating_element(a,n);
      System.out.println(result);
	}

}
