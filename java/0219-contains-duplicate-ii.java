class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> sett = new HashSet<>();
        Map<Integer,Integer> mapp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(sett.contains(nums[i])==true){
                int j = mapp.get(nums[i]);
                if(Math.abs(i-j)<=k){
                    return true;
                }
            }
            else{
                sett.add(nums[i]);
            }
            mapp.put(nums[i],i);
        }
        return false;
    }
}