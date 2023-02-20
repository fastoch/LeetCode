// 1480. Running Sum of 1D Array 
// https://leetcode.com/explore/featured/card/the-leetcode-beginners-guide/692/challenge-problems/4422/

// Given an array nums, we define a running sum of an array as runningSum[i] = sum(nums[0]...nums[i])
// Constraints: 
    // The number of nodes in the list is in the range [1, 1000]
    // The value of each element in the array is in the range [-10^6, 10^6]
// Example:
    // input: nums = [3,1,2,10,1]
    // output: results = [3,4,6,16,17]

class Solution {
    public [int] runningSum(int[] nums) {
        int[] results = new int[nums.length]; // makes an array the same size as our input array
        results[0] = nums[0]; // both input and output arrays will have the same first value
        
        for (int i = 1; i < nums.length; i++) {
            results[i] = nums[i] + results[i - 1];       
        }
        
        return results;
    }
    
    // time complexity = O(n), as we go over every element in our input.
    // space complexity = O(1). 
    // space complexity is constant because, aside from our input and output arrays, we do not create a data structure proportionnal in size to our input.
}

// Alternative solution - Overwritten Input Approach
class Solution2 {
    public [int] runningSum(int[] nums) {
        // this time, no need to initialize a new array
        // The first element is already the correct value
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1]; // nums[i] += nums[i-1]       
        }
        
        return nums;
    }
}
