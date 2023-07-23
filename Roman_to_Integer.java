import java.util.HashMap;

public class Roman_to_Integer {
   public static int func(String s) {
	   // map values 
	   HashMap<Character,Integer> hmap = new HashMap<>();
	   hmap.put('I', 1);
	   hmap.put('V', 5);
	   hmap.put('X', 10);
	   hmap.put('L', 50);
	   hmap.put('C', 100);
	   hmap.put('D', 500);
	   hmap.put('M', 1000);
	   int ans = hmap.get(s.charAt(s.length()-1));
	   for(int i=s.length()-2;i>=0;i--) {
		   int num = ;
		    if(hmap.get(s.charAt(i))< hmap.get(s.charAt(i+1))) { // means subtract
		    	ans = ans - hmap.get(s.charAt(i));
		    }
		    else { // means add
		    	ans = ans + hmap.get(s.charAt(i));
		    }
	   }
	   return ans;
   }
	public static void main(String[] args) {
		String s = "MCMXCIV";  // 1994
		int ans = func(s);
          System.out.println(ans);
	}

}
