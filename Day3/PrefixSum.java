import java.lang.reflect.Array;
import java.util.Arrays;

public class PrefixSum {
    /*Given an array build prefix sum
    Input  : arr[] = {10, 20, 10, 5, 15}
    Output : prefixSum[] = {10, 30, 40, 45, 60}
    */
    static int[] buildPrefix(int[] arr) {
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = arr[i] + prefixSum[i - 1];
        }
        System.out.println(Arrays.toString(prefixSum));
        return prefixSum;
    }

    public static int getSum(int[] arr, int left, int right) {
        int[] prefixsum = buildPrefix(arr);
        if (left == 0)
            return prefixsum[right];

        return prefixsum[right]-prefixsum[left-1];
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 5, 15};
        System.out.println(getSum(arr, 1, 3));


    }
}
