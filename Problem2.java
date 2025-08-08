// Created by Enanka Nandi
// Problem-2: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
 
//   Output: (examples)
//     1) input a = 1, then output : 1
//     2) input a = 2, then output : 1, 3
//     3) input a = 3, then output : 1, 3, 5
//     4) input a = 4, then output : 1, 3, 5, 7
//     .
//     .
//     5) input a = x, then output : 1, 3, 5, 7, .......

//  Generate odd numbers based on the input integer

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        // Starting from 1, generate odd numbers
        int num = 1; // first odd number
        for (int i = 1; i <= a; i++) {
            System.out.print(num);
            if (i < a) { // to avoid trailing comma
                System.out.print(", ");
            }
            num += 2; // move to next odd number
        }

        sc.close();
    }
}