public class Add_Strings {
    public static String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        StringBuilder sb = new StringBuilder();
        while(i>=0||j>=0||carry>0){
            int n1=0;
            int n2=0;
            if(i>=0){
                n1 = num1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                n2 = num2.charAt(j)-'0';
                j--;
            }
            int num = (n1+n2+carry)%10;
            carry = (n1+n2+carry)>=10 ? 1 : 0;
            sb.append(num);
        }
        return sb.reverse().toString();
    }
  public static void main(String[] args){
  String num1 = "123";
  String num2 = "78";
  String res = addStrings(num1,num2);
  System.out.println(res);
}
}