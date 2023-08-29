
public class Minimum_Penalty_for_a_Shop {

	public static void main(String[] args) {
		String s = "YYYY";
		int ans = minimum_penalty(s);
		System.out.println(ans);
	}
	
	private static int minimum_penalty(String s) {
		int n = s.length();
		int[] prefix = new int[n+1];
		int count_N = 0;
		prefix[0] = count_N;
		for(int i=0;i<n;i++) {
			if(s.charAt(i) == 'N') {
				count_N++;
			}
			prefix[i+1] = count_N;
		}
			
		int[] postfix = new int[n+1];
        int count_Y = 0;
        postfix[n] = count_Y;
		for(int i=n-1;i>=0;i--) {
			if(s.charAt(i) == 'Y') {
				count_Y++;
			}
			postfix[i] = count_Y;
		}
		
		int[] ans = new int[n+1];
		for(int i=0;i<ans.length;i++) {
			ans[i] = prefix[i] + postfix[i];
		}
		
		// now find first index having minimum penalty 
		int min = Integer.MAX_VALUE;
		int index=-1;
		for(int i=0;i<ans.length;i++) {
			 if(min > ans[i]) {
				 min = ans[i];
				 index = i;
			 }
		}
		return index;
	}
}

