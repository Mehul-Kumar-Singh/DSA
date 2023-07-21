public class Longest_Common_Prefix_string_amongst_an_array_of_strings{
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        int min_size_string=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
             min_size_string = Math.min(strs[i].length(),min_size_string);
        }
        String ans="";
        boolean flag = true;
        for(int j=0;j<min_size_string;j++){
                Character checK_common = strs[0].charAt(j);
                int i=0;
                while(i<strs.length){
                 if(checK_common != strs[i].charAt(j)){
                     flag = false;
                     break;
                   }
                   i++;
                  }
                 if(flag == true){
                     ans = ans + checK_common;
                 }
                 else{
                     break;
                 }
                }
                return ans;
          }
   public static void main(String[] args){
   String[] strs = {"flower","flow","flight"};
   String res = longestCommonPrefix(strs);
  System.out.println(res);
  }
}