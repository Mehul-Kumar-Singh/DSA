public class buy_and_sell_stock{
  public static int calculation(int[] a){
    int[] max_price = new int[a.length];
        int max = 0;
    for(int i=a.length-1;i>=0;i--){
         if(max < a[i]){
            max = a[i];
           } 
            max_price[i] = max;
     }
    // now calculate the difference 
      int ans = 0;
       int max_profit=0;
     for(int i=0;i<a.length;i++){
          max_profit = max_price[i]-a[i];
         if(ans < max_profit){
              ans = max_profit;
            }  
         }
return ans;
   }
public static void main(String[] args){
     int[] a = {7,6,4,3,1};
     int res = calculation(a);
     System.out.println(res);
   } 
}