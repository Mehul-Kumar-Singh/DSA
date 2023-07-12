import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class first_non_repeated_character {
   public static void m1(String s) {
	   boolean unique = true;
	   for(int i=0;i<s.length();i++) {
		   unique = true;
		   for(int j=0;j<s.length();j++) {
			   if(i!=j && s.charAt(i) == s.charAt(j)) {
				   unique=false;
			   }
		   }
		   if(unique) {
			   System.out.println(s.charAt(i));
			   break;
		   }
	   }
   }
   public static void m2(String s) {
	   Map<Character,Integer> map = new HashMap();
	   for(int i=0;i<s.length();i++) {
		   char ch = s.charAt(i);
		   if(map.containsKey(ch)) {
			   map.put(ch, map.get(ch)+1);
		   }
		   else {
		   map.put(ch, 1);
		   }
	   }
	   for(Entry<Character, Integer> entrySet : map.entrySet()) {
		   if(entrySet.getValue() == 1) {
			   System.out.println(entrySet.getKey());
			   break;
		   }
	   }
	  
   }
   
	public static void main(String[] args) {
		String s = "AABCDBE";
		m1(s);
		m2(s);
		
	}

}
