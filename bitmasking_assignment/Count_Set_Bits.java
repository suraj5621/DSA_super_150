package bitmasking_assignment;

// count number of 1s in binary representation of an integer

// Input Format
// Input N = Number of Test Cases, followed by N numbers

// Constraints
// Output Format
// Number of Set Bits in each number each in a new line

// Sample Input
// 3
// 5
// 4
// 15
// Sample Output
// 2
// 1
// 4
// Explanation
// Convert Binary to Decimal first and then count number of 1's present in all digits.

import java.util.*;
public class Count_Set_Bits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] testCases = new int[N];

        // Taking input for test cases
        for (int i = 0; i < N; i++) {
            testCases[i] = scanner.nextInt();
        }

        for (int num : testCases) {
            int setBitsCount = countSetBits(num);
            System.out.println(setBitsCount);
        }
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
