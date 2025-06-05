public class Example2 {

    public static boolean  checkIsPalindromeEfficient(String str) {
        int i = 0, j = str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static boolean  checkIsPalindromeNaive(String str) {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.equals(str.toString());


}

    public static void main(String[] args) {
        String str="abcdcba";
        System.out.println(checkIsPalindromeNaive(str));

    }
}
