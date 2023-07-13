public class check_Palindrome_Number{
    public boolean isPalindrome(int x) {
        int ans = 0;
        int rem = x; 
        int div = x;
        if(x<0){
            return false;
        }
        while(div>0){
          rem = div  %  10; // 121%10->1 // 12%10->2 // 1%10->1
          ans = ans * 10 + rem; // 0*10+1-> 1 // 1*10+2->12 // 12*10+1->121
          div = div / 10; // 121/10->12 // 12/10->1 //1/10->0
        }  
        if(ans == x){
            return true;
        }
        else{
            return false;
        } 
    public static void main(String[] args){
    int x = 121;
    boolean flag = isPalindrome(x);
System.out.println(flag);
}
}