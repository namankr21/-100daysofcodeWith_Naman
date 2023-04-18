public class day_16_Find_the_Maximum_Divisibility_Score {
    public static void main(String[] args) {
        int[]arr = {4,7,9,3,9};
        int[]div = {5,2,3};
        System.out.println(maxDivScore(arr,div));
    }
    public static int maxDivScore(int[] arr, int[] div) {
        int n = arr.length;
        int m = div.length;
        int max = -1;
        int max_num = Integer.MAX_VALUE;
        
        for(int i=0;i<m;i++)
        {
            int sc = 0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]%div[i]==0) sc++;
            }
            
            if(sc>max || (sc==max && div[i] < max_num))
            {
                max = sc;
                max_num = div[i];
            }
        }
        
        return max_num;
    }
}
