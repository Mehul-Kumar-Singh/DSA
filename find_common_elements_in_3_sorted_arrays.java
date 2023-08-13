public class find_common_elements_in_3_sorted_arrays
{
    ArrayList<Integer> commonElements(int a[], int b[], int c[], int n1, int n2, int n3) 
    {
ArrayList<Integer> al = new ArrayList<>();
    	int i=0, j=0, k=0;
    	while(i<a.length && j<b.length && k<c.length) {
    		if(a[i]==b[j]) {
    		    if(b[j]==c[k]) {
    		    	al.add(a[i]);
    		    	i++;
    		    	j++;
    		    	k++;
    		    }
    		    else if(b[j] > c[k]) {
    		    	k++;
    		    }
    		    else { // b[j] < c[k]
    		    	i++;
    		    	j++;
    		    }
    		}
    	else if(a[i] < b[j]) {
    			 i++;
    		}
    	else {
    			j++;
    		}
    		}
    	return al;
}
}