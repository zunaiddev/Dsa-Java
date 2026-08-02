package array;

public class SubArraySum {
    // Brute Force
    /*void main() {
        int[] arr = {3, -4, 5, 4, -1, 7, -8};

        int n = arr.length;

        int maxSum = arr[0];

        for (int start = 0; start < n; start++) {

            int currSum = 0;
            for (int end = start; end < n; end++) {
                currSum += arr[end];
                if (currSum > maxSum) maxSum = currSum;
            }
        }

        System.out.println(maxSum);
    }*/

    // Kadane's Algorithm
    void main() {
        int[] arr = {3, -4, 5, 4, -1, 7, -8};

        int maxSum = Integer.MIN_VALUE;
        int curSUM = maxSum;

        for (int j : arr) {
            curSUM += j;
            if (curSUM > maxSum) maxSum = curSUM;

            if (curSUM < 0) {
                curSUM = 0;
            }
        }

        System.out.println("Max Sum: " + maxSum);
    }
}