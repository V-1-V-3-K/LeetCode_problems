// -- Solution 1
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n*2];

        Arrays.fill(ret,0); // this line is optional as it increases the time taken to execute by 1ms in final solution
        for(int i=0; i<n; i++){
            ret[i] = nums[i];
            ret[n+i] = nums[i];
        }
        return ret;
    }
}

// -- Solution 2
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int []arr = new int[n*2];

        for(int i=0; i<n*2; i++){
            arr[i] = nums[i%n];
        }

        return arr;
    }
}