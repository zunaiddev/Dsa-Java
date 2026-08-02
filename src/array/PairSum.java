package array;

import java.util.Arrays;

public class PairSum {
    static void main(String[] args) {
        int[] arr = new int[]{2, 5, 11, 15};
        final int target = 13;

        System.out.println(Arrays.toString(bruteForce(arr, target)));
        System.out.println(Arrays.toString(optimalApproach(arr, target)));
    }

    static int[] bruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    static int[] optimalApproach(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            final int sum = arr[start] + arr[end];

            if (sum < target) {
                start++;
            } else if (sum > target) {
                end--;
            } else {
                return new int[]{start, end};
            }
        }

        return new int[]{start, end};
    }
}
