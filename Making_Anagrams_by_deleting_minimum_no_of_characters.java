package DSA;
import java.util.*;
public class Making_Anagrams_by_deleting_minimum_no_of_characters {

	public static void main(String[] args) {
		String s1 = "abs";
		String s2 = "abc";
		int res = minimum_number(s1,s2);
		System.out.println(res);
	}
	private static int minimum_number(String s1,String s2) {
		HashMap<Character,Integer> hmap1 = new HashMap<>();
		for(char ch : s1.toCharArray()) {
			hmap1.put(ch,hmap1.getOrDefault(ch,0)+1);
		}
		HashMap<Character,Integer> hmap2 = new HashMap<>();
		for(char ch : s2.toCharArray()) {
			hmap2.put(ch,hmap2.getOrDefault(ch,0)+1);
		}
		int charNotInString2=0;
		for(char ch : s1.toCharArray()) {
			if(hmap2.containsKey(ch)) {
				hmap2.put(ch,hmap2.get(ch)-1);
				if(hmap2.get(ch) == 0) {
					hmap2.remove(ch);
				}
			}
			else {
				charNotInString2++;
			}
		}
		// count characters freq left in hmap2
		int charLeftinhmap2 = 0;
		for(Map.Entry<Character,Integer> it: hmap2.entrySet()) {
			charLeftinhmap2 += it.getValue();
		}
		return charNotInString2 + charLeftinhmap2;
	}

}
