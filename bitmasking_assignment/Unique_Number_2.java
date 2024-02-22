package bitmasking_assignment;

import java.util.Scanner;

// We are given an array containg n numbers. All the numbers are present twice except for two numbers which are present only once. Find the unique numbers in linear time without using any extra space. ( Hint - Use Bitwise )

// Input Format
// First line contains the number n. Second line contains n space separated number.

// Constraints
// n < 10^5

// Output Format
// Output a single line containing the unique numbers separated by space

// Sample Input
// 4
// 3 1 2 1
// Sample Output
// 2 3
// Explanation
// Smaller number comes before larger number

public class Unique_Number_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // Number of elements
        
        int[] array = new int[N]; // Array to store elements
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        
        int xorResult = 0; // XOR result of all elements
        for (int num : array) {
            xorResult ^= num;
        }
        
        int rightmostSetBit = xorResult & -xorResult; // Rightmost set bit
        
        int unique1 = 0; // One of the unique elements
        int unique2 = 0; // Another unique element
        
        // Finding the two unique elements
        for (int num : array) {
            if ((num & rightmostSetBit) == 0) {
                unique1 ^= num;
            } else {
                unique2 ^= num;
            }
        }
        
        // Printing the unique elements in ascending order
        System.out.println(Math.min(unique1, unique2) + " " + Math.max(unique1, unique2));
    }
}
