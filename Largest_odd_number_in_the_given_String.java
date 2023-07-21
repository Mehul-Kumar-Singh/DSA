public class Largest_odd_number_in_the_given_String {
    public static String largestOddNumber(String num) {
        // check last digit, if last digit is odd, it means numbers to the left of that number is odd
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
   public static void main(String[] args){
   String num = "249057";
   String ans = largestOddNumber(num);
   System.out.println(ans);
  }
}