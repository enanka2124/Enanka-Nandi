// Created by Enanka Nandi
// Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
//   (examples)
//   input: [1,2,8,9,12,46,76,82,15,20,30]
//   Output: 
//     {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}

//  Count how many numbers are multiples of 1 to 9

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        // Given list of numbers
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // LinkedHashMap to keep output order same as 1..9
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        // Initialize map with keys 1 to 9 and value 0
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Check each number in the array
        for (int num : numbers) {
            // For each divisor from 1 to 9
            for (int d = 1; d <= 9; d++) {
                if (num % d == 0) {
                    // Increase count if divisible
                    countMap.put(d, countMap.get(d) + 1);
                }
            }
        }

        // Print result in same format as example
        System.out.println(countMap);
    }
}
