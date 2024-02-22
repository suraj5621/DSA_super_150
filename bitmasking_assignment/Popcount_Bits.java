package bitmasking_assignment;


// Let's denote pop_count(x) as the number of bits set ('1' bits) in the binary representation of the non-negative integer x.

// You are given a query consisting of pair of integers l and r.

// Find the x, such that l ≤ x ≤ r, and pop_count(x) is maximum possible.

// Note : If there are multiple such numbers find the smallest of them.

// Input Format
// Single line contains two integers l and r .

// Constraints
// 1 <= l,r <= 1018

// Output Format
// Print the answer in a separate line.

// Sample Input
// 5 10
// Sample Output
// 7 
// Explanation
// 710 = 1112
// Popcount ( 7 ) is 3 which is maximum possible popcount in the range [5,10]



import java.util.Scanner;

public class Popcount_Bits {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();
        long ans = l;
        long curr = 1;
        
        while ((ans | curr) <= r) {
            ans |= curr;
            curr <<= 1;
        }
        
        System.out.println(ans);
        scanner.close();
    }
}
