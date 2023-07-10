
public class rotate_matrix_by_90_clockwise_dir {
    public static int[][] rotate(int[][] a){
    	// First transpose the matrix
    	for(int i=0;i<a.length;i++) {
			for(int j=0;j<i;j++) {
					int temp = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = temp;
				}
			}
  
    
    
	 // interchange columns 1 and 3
			 int row=0;
			 for(int col=0;col<a[0].length;col++) {
				 int low=col;
				 int high = a[0].length-1;
				 while(low<high) {
					 //swap
					 int temp = a[row][low];
					 a[row][low] = a[row][high];
					 a[row][high] = temp;
					 low++;
					 high--;
				 }
				 row++;
			  }
           	return a;
    }
	public static void main(String[] args) {
		int[][] mat = { {1,2,3},{4,5,6},{7,8,9}};
		int[][] ans = rotate(mat);
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
/*
 1 2 3     7 4 1
 4 5 6  -->8 5 2
 7 8 9     9 6 3
*/