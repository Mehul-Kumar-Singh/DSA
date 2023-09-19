public class Find_Duplicate_Element{
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hmap.containsKey(nums[i])){
                int prev_f = hmap.get(nums[i]);
                int curr_f = prev_f  + 1;
                hmap.put(nums[i],curr_f);
            }
            else{
                hmap.put(nums[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> it : hmap.entrySet()){
                   if(it.getValue() > 1){
                       return it.getKey();
                   }
        }
        return -1;
    }
}