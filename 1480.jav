// Problem #1480 - Running Sum of 1D Array 

// Given an array nums, we define a running sum of an array as runningSum[i] = sum(nums[0]...nums[i])
// Constraints: 
    // The number of nodes in the list is in the range [1, 1000]
    // The value of each element in the array is in the range [-10^6, 10^6]
// Example:
    // input: nums = [3,1,2,10,1]
    // output: results = [3,4,6,16,17]

class Solution {
    public [int] runningSum(int[] nums){
        int[] results = new int[nums.length]; // makes an array the same size as our input array
        results[0] = nums[0];
    }
}
