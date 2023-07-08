// Linear Search
public class Linear_search{
 public static int search(int[] a, int key){
  int i=-1;
  for(i=0;i<a.length;i++){ 
     if(a[i] == key)
        return i;
  }
  return i;
 }

public static void main(String[] args){
 int[] a = {3,4,1,2,5};
 int key = 2;
 int index = search(a,key);
 System.out.println("Element is present at index: " +index+ " from 0-indexed counting. ");
 }
} 