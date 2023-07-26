/* 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
 * */
public class valid_palindrome {
	public static boolean func(String s) {
		String ans = "";
		//Step-1) remove all non-alphanumeric characters
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if((c>='A' && c<='Z') || (c>='a' && c<='z') || (c>='0' && c<='9')){
				ans = ans + s.charAt(i);
			}
		}
			String res = ans.toLowerCase();
			// check palindrome
			int i=0;
			int j=res.length()-1;
			while(i<=j) {
				if(res.charAt(i)!=res.charAt(j)){
					return false;
				}
				i++;
				j--;
			}
			
		return true;
	}
	public static void main(String[] args) {
		String s = "race a car";
		boolean flag = func(s);
        System.out.println(flag);
	}
}
