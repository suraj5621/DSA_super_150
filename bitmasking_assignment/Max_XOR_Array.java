package bitmasking;

import java.util.Scanner;

// You are given an array containing n elements. Xor of an array is defined as the xor of all the elements present in the array. You can remove atmost one element from the array to maximize the value of XOR of array. Find the maximum XOR value you can get for the resulting array.

// Input Format
// First line of input contains an integer n denoting the size of the array. After that n lines follow, where the i th line contains the i'th element of the array.

// Constraints
// 1 <= n <= 1000000 0 <= elements of array <= 10^18

// Output Format
// You have to print a single integer denoting the maximum xor you can get for the resulting array.

// Sample Input
// 3
// 1
// 2
// 3
// Sample Output
// 3
// Explanation
// After removing 3 from the array, the xor of the resulting array = 1 ^ 2 = 3 which is the maximum value you can attain.

public class Max_XOR_Array {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        long result = 0;
        long[] array = new long[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextLong();
            result ^= array[i];
        }

        long maximum = result;

        for (int i = 0; i < size; i++) {
            maximum = Math.max(maximum, result ^ array[i]);
        }

        System.out.println(maximum);
    }
}
