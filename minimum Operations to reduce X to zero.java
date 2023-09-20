class Solution {
    public int minOperations(int[] nums, int x) {
        Map<Integer, Integer> frontMap = new HashMap<>();
        frontMap.put(0,0);
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            frontMap.put(sum, i+1);
        }
        sum = 0;
        for(int i=nums.length; i>=0; i--){
            if(i!=nums.length) sum += nums[i];
            if(frontMap.containsKey(x-sum) && frontMap.get(x-sum)+nums.length-i<=nums.length){
                ans = Math.min(ans, frontMap.get(x-sum)+nums.length-i);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}