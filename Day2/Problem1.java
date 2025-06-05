import java.util.HashSet;

/**
 * @author Shivendra Deep
 * shivendradeep939@gmail.com
 */
/*
 * given an array count the no of distinct element
 * {15,12,13,12,13,13,18}
 * output->4
 *
 *
 * */
public class Problem1 {
    /*
     * For every element go to its left and check
     * whether there is duplicate for it or not
     * */
    public static int countIntNaive(int arr[]) {
        //i=0 ke lie hamesha res=1 ho jaega kyuki single number hmesha unique hoga for first occurence
        //hmesha uss number ke first occurence pe res++ hoga
        boolean flag;
        int res=0;
        for (int i = 0; i < arr.length; i++) {
            flag = false;
            for (int j = 0; j < i; j++) {
                //if the element is seen previously immediately break the loop no need of further traversing
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            //that means its the first occurence of element(new element is seen)
            if(flag==false)
                res++;

        }
        return res;
    }

    public static int countIntEff(int[] arr){
        HashSet<Integer> hs=new HashSet<>();
        for(int num:arr)
            hs.add(num);
        return hs.size();
    }
    public static void main(String[] args) {

        int[] arr = {15, 12, 13, 12, 13, 13, 18};
//        System.out.println(countIntNaive(arr));
        System.out.println(countIntEff(arr));


    }

}
