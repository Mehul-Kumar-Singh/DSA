import java.util.Arrays;
public class rearrange_elements_by_sign {
   public static int[] cal(int[] a) {
	   for(int i=0;i<a.length;i++) {
		   if(i%2==0) { // even indices
			 if(!(a[i]>0)) { 
			   int j=i+1;
			   while(j<a.length) {
				   if(a[j]>0) {
				   swap(a,a[i],a[j]);
			       }
			   }
			 }
		   }
		   else {  // odd indices
			   if(!(a[i]<0)) {
				   int k = i+1;
				   while(k<a.length) {
					   // find -ve element
					   if(a[k]<0) {
						   swap(a,a[i],a[k]);
					   }
				   }
			   }
		   }
		}
	   return a;
   }
   public static void swap(int[] a,int i,int j) {
	   int temp = i;
	   i = j;
	   j = temp;
   }
	public static void main(String[] args) {
		int[] a = {1,2,-4,-5};
		int[] res = cal(a);
		System.out.println('H');
        System.out.println(Arrays.toString(res));
	}

}
