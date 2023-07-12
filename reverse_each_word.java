import java.util.Arrays;

public class reverse_each_word {

	 public static void reverse_word(String s) {
		 String[] words = s.split(" ");
		  
		for(String word : words) {
			// now reverse each word
			 System.out.print(reverse(word)+ " ");
		 }
	 }
	 public static String reverse(String s) {
		 StringBuilder sb = new StringBuilder(s);
		 String res = new String(sb.reverse());
		 return res;
		 }
	public static void main(String[] args) {
		String s = "java code";
		reverse_word(s);


	}

}
