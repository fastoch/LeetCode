// https://leetcode.com/explore/featured/card/the-leetcode-beginners-guide/692/challenge-problems/4424/
// https://leetcode.com/problems/fizz-buzz/

"""
Given an integer n, return a string array answer (1-indexed) where:
  answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
  answer[i] == "Fizz" if i is divisible by 3.
  answer[i] == "Buzz" if i is divisible by 5.
  answer[i] == i (as a string) if none of the above conditions are true.
"""

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
      
        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            
            if (divisibleBy3 && divisibleBy5) {
                answer.add("FizzBuzz");
            } else if (divisibleBy3) {
                answer.add("Fizz");
            } else if (divisibleBy5) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }
        
        return answer;
    }
}


"""
Explanation:
First, we create our return list. 
We initialize it with a capacity of n items, which is not necessary, as array lists resize automatically when you add elements to them.
Then we iterate through the list and check divisibility of each element, starting with the combined condition.
The add() method appends the current element to the end of the list, which is the right place for any current element, as we are 
working our way up from the smallest value.
Lastly, we return the answer array once our loop finishes.
"""
