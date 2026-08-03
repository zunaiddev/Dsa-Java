package array;

public class MajorityElement {
    static void main() {
        int[] arr = {1, 2, 2, 1, 1, 2, 2};

        System.out.println(solve(arr));
    }

    static int solve(int[] arr) {
        int freq = 0;
        int ans = 0;

        for (int i : arr) {
            if (freq == 0) ans = i;

            if (i == ans) freq++;
            else freq--;
        }

        return ans;
    }
}
