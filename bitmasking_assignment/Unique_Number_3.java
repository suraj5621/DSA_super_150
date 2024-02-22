package bitmasking_assignment;

// We are given an array containg n numbers. All the numbers are present thrice except for one number which is only present once. Find the unique number. Only use - bitwise operators, and no extra space.

// Input Format
// First line contains the number n. Second line contains n space separated number.

// Constraints
// N < 10^5

// Output Format
// Output a single line containing the unique number

// Sample Input
// 7
// 1 1 1 2 2 2 3
// Sample Output
// 3
// Explanation
// 3 is present only once

import java.util.Scanner;

public class Unique_Number_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int[] bitCounts = new int[32];
        
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            for (int j = 0; j < 32; j++) {
                if ((num & (1 << j)) != 0) {
                    bitCounts[j]++;
                }
            }
        }
        
        int uniqueNumber = 0;
        for (int i = 0; i < 32; i++) {
            if (bitCounts[i] % 3 != 0) {
                uniqueNumber |= (1 << i);
            }
        }
        
        System.out.println(uniqueNumber);
    
    }
}
