// 1672. Richest Customer Wealth
// https://leetcode.com/problems/richest-customer-wealth/
// https://leetcode.com/explore/featured/card/the-leetcode-beginners-guide/692/challenge-problems/4423/

// Example with 3 customers and 3 banks (respectively 3 rows x 3 columns)
    // input table: accounts = [[7,1,3],[2,8,7],[1,9,5]]
    // output: 17

// each row i corresponds to a customer
// each column j corresponds to a particular bank
// The richest customer will be the row with the maximum sum

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0;
        
        // iterate through each customer in accounts
        for (int[] customer : accounts) { // int[] because accounts is an array of integer arrays
            int[] currentCustomerWealth = 0;  
            
            // iterate through all the banks the customer has money in
            for (int bank : customer) { // int because customer is an array of integers
                currentCustomerWealth += bank;
            }
            
            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }
        
        return maxWealthSoFar;
    }
}
