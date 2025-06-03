import java.lang.reflect.Array;
import java.util.Arrays;

public class Example1 {

    public static void getCharCount(String str) {
        int arr[] = new int[26];
        //first we are taking each character of the passed string str
        //after that we are using character as an index
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;//type casting from char to int
            /*
             *for first iteration
             *
             * i=0->arr['g'-'a'] now the subtraction will be  between the ascii values
             *
             * */
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println((char) (i + 'a') + "--" + arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        //System.out.println("test");
        getCharCount("geeksforgeeks");
    }
}
