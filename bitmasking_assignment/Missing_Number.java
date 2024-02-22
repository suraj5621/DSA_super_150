package bitmasking_assignment;


// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

// Input Format
// You are given with n the number of integers. N integers.

// Constraints
// n == nums.length 1 <= n <= 10^4
// 0 <= nums[i] <= n
// All the numbers of nums are unique.

// Output Format
// Return the missing integer

// Sample Input
// 3
// 3 0 1
// Sample Output
// 2
// Explanation
// n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.


import java.util.Scanner;

public class Missing_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(missingNumber(nums));
        scanner.close();
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
