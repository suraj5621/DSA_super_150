package bitmasking_assignment;

// Prateek Bhayia likes to play with bits. One day Prateek bhayia decides to assign a task to his student Sanya. You have help Sanya to complete this task. Task is as follows - Prateek Bhayia gives Q queries each query containing two integers a and b. Your task is to count the no of set-bits in for all numbers between a and b (both inclusive)

// Input Format
// Read Q - No of Queries, Followed by Q lines containing 2 integers a and b.

// Constraints
// Q,a,b are integers.

// Output Format
// Q lines, each containing an output for your query.

// Sample Input
// 2
// 1 1
// 10 15
// Sample Output
// 1
// 17



import java.util.*;

public class Playing_With_Bits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt(); 

    
        for (int i = 0; i < Q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int totalSetBits = 0;
            for (int num = a; num <= b; num++) {
                totalSetBits += countSetBits(num);
            }
            System.out.println(totalSetBits);
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
