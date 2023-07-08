// print all permutations of an array
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class print_all_permutations{
    public static void permute(int[] a, List<List<Integer>> lol,boolean[] mark,ArrayList<Integer> store){
      // since we r using recursion,give base cond'n first
          if(store.size()==a.length){
             lol.add(new ArrayList<>(store)); 
              return ;
           }
         for(int i=0;i<a.length;i++){
            if(mark[i] == false){
                store.add(a[i]);
                mark[i] = true;
                permute(a,lol,mark,store);
                store.remove(store.size()-1);
                mark[i] = false;
              }
             }
     }
  public static List<List<Integer>> print_all_per(int[] a){
       List<List<Integer>> lol = new ArrayList<>();
       boolean[] mark = new boolean[a.length];
       ArrayList<Integer> store = new ArrayList<>();
       permute(a,lol,mark,store);
       return lol;
   }
  public static void main(String[] args){
   int[] a = {1,2,3};
   List<List<Integer>> res = print_all_per(a);
   System.out.println(res);
 }
}