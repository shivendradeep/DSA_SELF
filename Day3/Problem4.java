import java.util.Arrays;

/*Given an Array Remove Duplicates*/
public class Problem4 {
    /*0(N) Extra Space
     * O(N) Time*/
    static void removeDuplicatesNaive(int[] arr) {
        int res = 1;
        int[] auxarr = new int[arr.length];
        auxarr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (auxarr[res - 1] != arr[i]) {
                auxarr[res] = arr[i];
                res++;
            }
        }

//        System.out.println(Arrays.toString(auxarr));
    }

    /*the idea is to manipulate the same array*/
    static int removeDuplicatesEff(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[res-1] != arr[i]) {
                arr[res] = arr[i];
                res++;
            }
        }
//        System.out.println(Arrays.toString(arr));
        return res;

    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30, 40, 40, 40, 40};
        System.out.println(   removeDuplicatesEff(arr));

    }
}
