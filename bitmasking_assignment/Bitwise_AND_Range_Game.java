package bitmasking_assignment;


// Given two integers left and right that represent the range [left, right], print the bitwise AND of all numbers in this range, inclusive.

// Input Format
// First line contains two integers left and right.

// Constraints
// 0 <= left <= right <= 231 - 1

// Output Format
// Print Bitwise AND of the given range.

// Sample Input
// 5 7
// Sample Output
// 4
// Explanation
// 5 AND 6 AND 7 = 4.



import java.util.Scanner;

public class Bitwise_AND_Range_Game {
    public static int calculateRangeBitwiseAnd(int left, int right) {
        while (left < right) {
            // Turn off the rightmost bit of 'right' until it's less than 'left'
            right = right & (right - 1);
        }
        return right;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rangeLeft = scanner.nextInt();
        int rangeRight = scanner.nextInt();
        System.out.println(calculateRangeBitwiseAnd(rangeLeft, rangeRight));

        scanner.close();
    }
}
