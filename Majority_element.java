class Majority_element{
    public static int majorityElement(int[] a) {
        int count=0;
        int element=0;
        for(int i=0;i<a.length;i++){
            if(count==0){
                element = a[i];
            }
            if(element != a[i]){
                count--;
            }
            else{
                count++;
            }
        }
        // since here it is already given there always exists a 
        // majority element that's why we don't have to check
        //  for majority element.
      return element;
    }
  public static void main(String[] args){
  int[] a = {2,2,1,1,1,2,2};
  int res = majorityElement(a);
  System.out.println(res);
 }
}