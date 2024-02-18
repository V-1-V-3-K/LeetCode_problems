class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> sett = new HashSet<Integer>();
       for(int i=0; i<nums.length; i++){
           if(sett.contains(nums[i])==true){
               return true;
           }
           sett.add(nums[i]);
       } 
       return false;
    }
}