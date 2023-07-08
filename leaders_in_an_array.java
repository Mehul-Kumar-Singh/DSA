import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Main
{ 
    // METHOD-1) Using nested loops T.C--> O(N^2) S.C--> O(N) Worst case if we direct print then O(1)
    public static ArrayList<Integer> find_leaders_naive_approach(int[] a){
        ArrayList<Integer> al = new ArrayList<>();
        boolean check = true;
        for(int i=0;i<a.length-1;i++){
              check = true;
            for(int j=i+1;j<a.length;j++){
                if(a[i] < a[j]){
                    check = false;
                }
            }
            if(check){
                al.add(a[i]);
            }
        }
        al.add(a[a.length-1]); // last element is always a find_leaders
        return al;
    }
    
    
    //   METHOD-2) Using extra array T.C--> O(N) S.C--> O(N) Worst case if we direct print then O(1)
    public static ArrayList<Integer> find_leaders_better_approach(int[] a,int n){
        // create an array to store max elements of an element towards right
        ArrayList<Integer> al = new ArrayList<>();
        int[] b = new int[a.length];
        b[n-1] = a[n-1];
        for(int i=n-2;i>=0;i--){
            b[i] = Math.max(b[i+1],a[i+1]);
        }
        for(int i=0;i<n-1;i++){
            if(a[i]>b[i]){
                al.add(a[i]);
            }
        }
        // since last element is always a leader
        al.add(a[n-1]);
        return al;
    }
    
    
    // METHOD-3) Using only a max variable T.C--> O(N) S.C--> O(N) Worst case if we direct print then O(1)
    public static ArrayList<Integer> find_leaders_optimal_approach(int[] a){
        ArrayList<Integer> al = new ArrayList<>();
        int n = a.length;
        al.add(a[n-1]);
        int max = a[n-1];
        for(int i=n-2;i>=0;i--){
            if(a[i]>max){
                al.add(a[i]);
                max = a[i];
            }
        }
        return al;
    }
	public static void main(String[] args) {
	    int[] a = {10, 22, 12, 3, 0, 6};
	    int n = a.length;
	    ArrayList<Integer> res = new ArrayList<>();
	   // res = find_leaders_naive_approach(a);
	   // res = find_leaders_better_approach(a,n);
	    res = find_leaders_optimal_approach(a);
	    // here, answer will not be in order
	   // Collections.sort(res,Collections.reverseOrder());
	   //  <------ OR ----->
	   for(int i=res.size()-1;i>=0;i--){
	       System.out.print(res.get(i)+ " ");
	   }
}
}
