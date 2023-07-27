
public class Even_number_of_digits {
	// METHOD-1)  count numbers of digits in a number
	static boolean count_digits_using_counting(int element) {
		if(element == 0) return true;
		int count=0;
		if(element < 0) element *= -1;
		while(element > 0) { //12>0 // 1>0 // 0>0->F
			element = element / 10; //1 0
			count++; // 1 2
        }
		return count%2==0;
	}
       // METHOD-2) converting each element to string
	static boolean count_digits_using_String(int element) {
		if(element == 0) return true;
		element = element < 0 ? -element : element;
		String str = element + "";
		return str.length()%2==0;
	}
       // METHOD-3) using logarithmic function
       static int count_digits_in_one_line(int element){
		if(element == 0) return 0;
		if(element < 0) element *= -1;
		return (int)(Math.log10(element))+1;
	}
       public static int findNumbers(int[] a) {  // MAIN FUNCTION
	   int count=0;
	   for(int element : a) {
		   // if(count_digits_in_one_line(element)) {
	           //		   count++;
		   //  }
                        if(count_digits_in_one_line(element)%2==0){
						count++;
					}
	   }
	   return count;
   }
   
	public static void main(String[] args) {
		int[] a = {1, -344, 8, 786,0};
		int ans = findNumbers(a);
		System.out.println(ans);
	}
}
