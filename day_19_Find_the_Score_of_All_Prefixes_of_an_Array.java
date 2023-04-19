public class day_19_Find_the_Score_of_All_Prefixes_of_an_Array {
    public static void main(String[] args) {
        int[]arr = {2,3,7,5,10};
        long[]ans = findPrefixScore(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    public static long[] findPrefixScore(int[] arr) {
        long[]ans = new long[arr.length];

        long score = 0;
        int max = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max) max = arr[i];

            score += arr[i] + max;
            ans[i] = score;
        }

        return ans;
    }
}
