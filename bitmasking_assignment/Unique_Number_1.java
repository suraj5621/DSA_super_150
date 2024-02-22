package bitmasking_assignment;

// We are given an array containg n numbers. All the numbers are present twice except for one number which is only present once. Find the unique number without taking any extra spaces and in linear time. ( Hint - Use Bitwise )

// Input Format
// First line contains the number n. Second line contains n space separated number.

// Constraints
// n < 10^5

// Output Format
// Output a single line containing the unique number

// Sample Input
// 7
// 1 1 2 2 3 3 4 
// Sample Output
// 4
// Explanation
// 4 is present only once

import java.util.Scanner;

public class Unique_Number_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums [] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum^nums[i];
        }
        System.out.println(sum);
    }
}
