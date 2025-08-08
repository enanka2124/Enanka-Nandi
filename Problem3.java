// Created by Enanka Nandi
// Problem-3: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
 
//   Output: (examples)
//     1) input a = 1, then output : 1
//     2) input a = 2, then output : 1
//     3) input a = 3, then output : 1, 3, 5
//     4) input a = 4, then output : 1, 3, 5
//     5) input a = 5, then output : 1, 3, 5, 7, 9
//     6) input a = 6, then output : 1, 3, 5, 7, 9
//     .
//     .
//     7) input a = x, then output : 1, 3, 5, 7, .......

//  Generate odd numbers with a special rule for even inputs



import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the input
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        // Decide how many terms to print
        int terms;
        if (a % 2 == 0) { // even case
            terms = a - 1;
        } else { // odd case
            terms = a;
        }

        // Print the odd numbers
        int num = 1;
        for (int i = 1; i <= terms; i++) {
            System.out.print(num);
            if (i < terms) {
                System.out.print(", ");
            }
            num += 2;
        }

        sc.close();
    }
}