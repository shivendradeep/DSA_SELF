public class Problem3 {
   public static int getLargestIndexEff(int[] arr){
       int res=0;
       for(int i=1;i<arr.length;i++){
           if(arr[i]>arr[res])
               res=i;

       }
       return res;
   }

    public static void main(String[] args) {
        int[] arr={1,4,5,2,7,28,29};
        System.out.println(getLargestIndexEff(arr));

    }
}
