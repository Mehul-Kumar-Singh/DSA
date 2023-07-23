public class maximum_nesting_depth_of_the_parentheses{
    public static int maxDepth(String s) {
        if(s.length()==0){
            return 0;
        }
        int max=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                max = Math.max(count,max);
            }
            else if(s.charAt(i)==')'){
                   count--;
            }
        }
        return max;
   }
   public static void main(String[] args){
     String s = "(1+(2*3)+((8)/4))+1";
    int ans = maxDepth(s);
  System.out.println(ans);
     } 
  }
    