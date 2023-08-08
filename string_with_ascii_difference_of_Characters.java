
public class string_with_ascii_difference_of_Characters {
   public static void ascii_diff(String s) {
	   StringBuilder ans = new StringBuilder();
	   ans.append(s.charAt(0));
	   
	   for(int i=1;i<s.length();i++) {
		   int diff = s.charAt(i) - s.charAt(i-1);
		   ans.append(diff);
		   ans.append(s.charAt(i));
	   }
	   System.out.println(ans);
   }
	public static void main(String[] args) {
    String s = "abdgca";
    ascii_diff(s);
	}

}
