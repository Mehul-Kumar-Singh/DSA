
public class Binary_Search_using_recursion {

	public static void main(String[] args) {
int[] a = {1,2,3,4,5};
int target = 5;
int start = 0;
int end = a.length-1;
int index = bs(a,target,start,end);
System.out.println("Index is: " +index);
	}

	public static int bs(int[] a,int target,int start,int end) {
		if(start > end) {
			return -1;
		}
		int mid = start + ((end-start) / 2);
		if(a[mid] == target) {
			return mid;
		}
		else if(a[mid] < target) {
			return bs(a,target,mid+1,end);
		}
		else {
			return bs(a,target,start,mid-1);
		}
	}
}
