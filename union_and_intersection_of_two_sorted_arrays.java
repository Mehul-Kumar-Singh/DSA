import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class union_and_intersection_of_two_sorted_arrays {
  public static void union_brute_force(int[] a, int[] b) {
	  // using Set --> T.C : O(Nlogn) + O(NlogN) S.C : N1 + N2
	 Set<Integer> set = new HashSet<>();
	 for(int element : a) {
		 set.add(element);
	 }
	 for(int element : b) {
		 set.add(element);
	 }
	 System.out.println(set);
  }
  public static void union_optimized(int[] a, int[] b) {
   // two pointers approach
	  ArrayList<Integer> al = new ArrayList<>();
	  int i=0,j=0;
	  while(i<a.length && j<b.length) {
		  if(a[i] < b[j]) {
			  if(!al.contains(a[i])) {
				  al.add(a[i]);
			  }
			  i++;
		  }
		  else {
			  if(!al.contains(b[j])) {
			      al.add(b[j]);
		      }
			  j++;
		  }
	  }
	  while(i<a.length) {
		  if(!al.contains(a[i])) {
			  al.add(a[i]);
		  }
		  i++;
	  }
	  while(j<b.length) {
		  if(!al.contains(b[j])) {
			  al.add(b[j]);
		  }
		  j++;
	  }
	  System.out.println(al);
  }
  public static void intersection_brute(int[] a, int[] b) {
	 ArrayList<Integer> al = new ArrayList<>();
	  int[] visited = new int[b.length];
	 Arrays.fill(visited, 0);
	 int i=0;
	 while(i<a.length) { // T.C: O(N1*N2) S.C: O(based on array which we take maybe a.length or b.length take smaller)
		 for(int j=0;j<b.length;j++) {
			 if(a[i] == b[j] && visited[j]==0) {
				 al.add(a[i]);
				 visited[j] = 1;
				 break;
			 }
			 if(a[i] < b[j]) { // extra condition as sorted array is given, if a[i] < b[j] no need to check further
				 break;
			 }
		 }
		 i++;
	 }
	 System.out.println(al);
  }
  public static void intersection_optimized(int[] a,int[] b) {
	  // Two pointers
	  ArrayList<Integer> al = new ArrayList<>();
	  int i=0,j=0;
	  while(i<a.length && j<b.length) {
		  if(a[i] < b[j]) {
			  i++;
		  }
		  else if(a[i] == b[j]) {
			  al.add(a[i]);
			  i++;
			  j++;
		  }
		  else { // a[i] > b[j]
			  j++;
		  }
	  }
	  System.out.println(al);
  }
	public static void main(String[] args) {
		int[] a = {1,2,3,3,4,5,6};
		int[] b = {2,3,3,5,6,6,7};
		System.out.println("Union--> ");
		union_brute_force(a,b);
		union_optimized(a,b);
		System.out.println("Intersection--> "); 
		intersection_brute(a,b);
		intersection_optimized(a,b); 
	} 
}
