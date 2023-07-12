
public class remove_all_special_character {
  
	public static void remove_special_m1(String s) {
	   String ans = s.replaceAll("[^a-zA-Z0-9]", "");
	   System.out.println(ans);
   }
	public static void remove_special_m2(String s) {
		String ns="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>64 && s.charAt(i)<=122) {
				ns = ns + s.charAt(i);
			}
		}
		System.out.println(ns);
	}
	public static void main(String[] args) {
		String s = "$M%EH@U$L";
		remove_special_m1(s);
		remove_special_m2(s);

	}
}
