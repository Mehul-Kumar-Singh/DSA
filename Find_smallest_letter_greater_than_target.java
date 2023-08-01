
public class Find_smallest_letter_greater_than_target {
   public static Character smallestLetter(Character[] letters, Character target) {
	   int start=0;
	   int end = letters.length-1;
	   while(start <= end) {
		   int mid = start + (end-start)/2;
		  if(letters[mid] > target) {
			  end = mid -1;
		  }
		  else {
			  start = mid + 1;
		  }
	   }
	   return letters[start%letters.length];
   }
	public static void main(String[] args) {
		Character[] letters = {'c','f','j' };
		char target = 'c';
		char res = smallestLetter(letters,target);
		System.out.println("Smallest letter greater than target is: " +res);

	}

}
