package DSA;
import java.util.List;
import java.util.*;
public class Group_Anagrams {

	public static void main(String[] args) {
		String[] str = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> ans = group_anagrams_m1(str);
		System.out.println(ans);
	}
	private static List<List<String>> group_anagrams_m1(String[] str){
		// sort the strings of the array
		HashMap<String,List<String>> hmap = new HashMap<>();
		for(int i=0;i<str.length;i++) {
			String s = str[i]; // eat
			String key = sorted_string(s);
			
			if(!hmap.containsKey(key)) {
				hmap.put(key,new ArrayList<>());
			}	
			hmap.get(key).add(s);
		}
		List<List<String>> resultList = new ArrayList<>();
		for(Map.Entry<String,List<String>> it: hmap.entrySet()) {
			resultList.add(it.getValue());
		}
		return resultList;
	}
	
	private static String sorted_string(String s) {
		// convert string to array
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		String key = String.valueOf(arr);
		return key;
		}
}
