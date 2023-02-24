// 1342. Number of Steps to Reduce a Number to Zero
// https://leetcode.com/explore/learn/card/the-leetcode-beginners-guide/692/challenge-problems/4425/
"""
Given an integer num, return the number of steps to reduce it to zero.
In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
"""
  
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
      
        while (num > 0) {
          if (num % 2 == 0){
            num /= 2;
          } else {
            num--;
          }
          steps++;
        }
        return steps;
    }
}


// Alternative - Bitwise Approach - 4:25
// Evernote: Programming > LeetCode > Problem #1342
"""
This approach uses slightly more advanced concepts:
  - Binary representation of integers
  - Bitwise Shift Operators
  - Bitwise Logical Operators
  - Bitmasks
"""  
  
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
      
        while (num > 0) {
          // Before, we used num % 2
          if ((num & 1) == 0){
            // Before, we used num /= 2
            num >>= 1; // returns all of num's bits shifted right by 1, which is equivalent to dividing by two
          } else {
            num--;
          }
          steps++;
        }
        return steps;
    }
    // time complexity = O(logn), as the number of steps we take depends on the amount of times we halve the value of our input
    // space complexity = O(1), as we are not creating any data structures proportional in size to our input
}
