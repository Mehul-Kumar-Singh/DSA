// count max consecutive one's
public class count_max_ones{
 public static int max_ones(int[] a){
   int max_count = 0;
   int count=0;
   for(int i=0;i<a.length;i++){ 
    if(a[i] == 1){
        count++;
      }
    else{
       count = 0;
      }
    max_count = Math.max(count,max_count);
   }
   return max_count;
 }
public static void main(String[] args){
  int[] a = {1,0,1,1,1,0,0,1,1};
  int res = max_ones(a); 
  System.out.println(res);
 }
}