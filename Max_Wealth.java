
public class Max_Wealth {
   public static int maximumWealth(int[][] accounts) {
	   int max = 0;
	   for(int i=0;i<accounts.length;i++) {
		   int sum = 0;
		   for(int j=0;j<accounts[i].length;j++) {
			   sum = sum + accounts[i][j];
		   }
		   if(max < sum) {
			   max = sum;
		   }
	   }
	   return max;
   }
	public static void main(String[] args) {
		int[][] accounts = {
				{2,8,7},
				{7,1,3},
				{1,9,5}
		  };
		int ans = maximumWealth(accounts);
        System.out.println(ans);
	}

}
