public class EquilibriumPoint {
    static boolean getSum(int[] arr) {
        int ls = 0, rs = 0;
        for (int i = 0; i < arr.length; i++) {
            rs += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            rs = rs - arr[i];
            if (rs == ls)
                return true;
            ls += arr[i];
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        getSum(arr);
    }
}
