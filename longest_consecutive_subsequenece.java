class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);      
HashSet<Integer> hs=new HashSet<Integer>();
        int max=0,count=0;
        for(int i=0;i<nums.length;i++)
            hs.add(nums[i]);
        for(int i=0;i<nums.length;i++){
        if(!hs.contains(nums[i]-1)){
            count=1;
            while(hs.contains(++nums[i])){
                count++;
            }
        }
            max=Math.max(count,max);
        }
        return max;
    }
}
