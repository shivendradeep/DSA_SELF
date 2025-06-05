import java.util.HashMap;

public class Problem2 {
    public static void countFrequencyNaive(int[] arr) {
        int res;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                continue;
            }
            res = 1;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] == arr[i])
                    res++;
            }
            System.out.println(arr[i] + " " + res);
        }
    }
    public static void countFrequencyEff(int[] arr){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        System.out.println(hm);

    }

    public static void main(String[] args) {
        int arr[] = {10, 12, 10, 15, 10, 20, 12, 12};
        countFrequencyEff(arr);

}
}
