// 1342. Number of Steps to Reduce a Number to Zero
"""
Given an integer num, return the number of steps to reduce it to zero.
In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
"""
  
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
      
        while (num > 0) {
          if (num % 2 == 0){
            n = n/2;
            steps += 1;
          }
          else {
            n -= 1;
            steps += 1;
          }
        }
        return steps;
    }
}
