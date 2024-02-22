package bitmasking;

// A bus has n rows of seats, numbered from 1 to n and there are ten seats in each row, labelled from 1 to 10.

// Given the list of reservedSeats containing the numbers of seats already reserved, for example, reservedSeats[i] = [3,8] means the seat located in row 3 and labelled with 8 is already reserved.

// Return the maximum number of four-person groups you can assign on the bus seats. A four-person group occupies four adjacent seats in one single row. Seats across an aisle (such as [3,3] and [3,4]) are not considered to be adjacent, but there is an exceptional case on which an aisle split a four-person group, in that case, the aisle split a four-person group in the middle, which means to have two people on each side.

// Input Format
// First line of input contains two integer n and m, number of rows and number of reserved seats.
// Following m line contains two integer i and j representing that seat located in row 3 and labelled with 8 is already reserved.

// Constraints
// 1 <= n <= 10^9
// 1 <= reservedSeats.length <= min(10*n, 10^4)
// reservedSeats[i].length == 2
// 1 <= reservedSeats[i][0] <= n
// 1 <= reservedSeats[i][1] <= 10
// All reservedSeats[i] are distinct.
// Output Format
// Return single integer the maximum number of four-person groups you can assign on the bus seats.

// Sample Input
// 3 6
// 1 2
// 1 3
// 1 8
// 2 6
// 3 1
// 3 10
 
// Sample Output
// 4
// Explanation

// The figure above shows the optimal allocation for four groups, where seats mark with blue are already reserved and contiguous seats mark with orange are for one group.


import java.util.*;

public class Allocate_Bus_Seats {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int m = scanner.nextInt();
        long res = 2 * n;
        HashMap<Long, List<Integer>> mp = new HashMap<>();

        for (int i = 0; i < m; i++) {
            long r = scanner.nextLong();
            int c = scanner.nextInt();

            if (!mp.containsKey(r)) {
                mp.put(r, new ArrayList<>());
            }

            mp.get(r).add(c);
        }

        for (long i : mp.keySet()) {
            int count = 0;
            boolean[] f = new boolean[3];

            for (int c : mp.get(i)) {
                if (!f[0] && c >= 2 && c <= 5) {
                    f[0] = true;
                    count++;
                }

                if (!f[1] && c >= 6 && c <= 9) {
                    f[1] = true;
                    count++;
                }

                if (!f[2] && c >= 4 && c <= 7) {
                    f[2] = true;
                    count++;
                }
            }

            if (count == 3)
                res -= 2;
            else if (count > 0)
                res--;
        }

        System.out.println(res);
    }
}
