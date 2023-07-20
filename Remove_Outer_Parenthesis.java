import java.util.Stack;

public class Remove_Outer_Parenthesis {
    private static String removeOuterParentheses(String s) {
        String ans = "";
        Stack<Character> st = new Stack();
        for(int i=0;i<s.length();i++) {
        	if(st.isEmpty()) {
        		st.push(s.charAt(i));
        	}
        	else {
        		if(s.charAt(i) == '(') {
        			st.push('(');
        			ans = ans + '(';
        		}
        		else {
        			st.pop();
        			if(!st.isEmpty()) {
        				ans += ')';
        			}
        		}
        	}
        }
        return ans;
    }
   public static void main(String[] args){
   String s = "";
   String ans = removeOuterParentheses(s);
   System.out.println(ans);
}