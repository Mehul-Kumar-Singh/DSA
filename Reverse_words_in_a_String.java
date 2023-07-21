// import java.util.StringBuilder;

public class Reverse_words_in_a_String{
 public static String fun(String s){
  // trim beginning and ending extra spaces
    s.trim(); 
   String[] char_array = s.split("\\s+");
   reverse(char_array,0,char_array.length-1);
   StringBuilder sb = new StringBuilder();
   for(int i=0;i<char_array.length;i++){
       sb.append(char_array[i]).append(" ");
     }
   // At last, convert StringBuilder to string and then trim ending extra space 
  return sb.toString().trim();
  }
 public static void reverse(String[] char_array, int i, int j){
      while(i<=j){
      String temp = char_array[i];
      char_array[i] = char_array[j];
      char_array[j] = temp;
      i++;
      j--;
     }
  }
 public static void main(String[] args){
  String str = "This is a string.";
  String ans = fun(str);
System.out.println(ans);
  }
   }