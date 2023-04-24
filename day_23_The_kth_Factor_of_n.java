public class day_23_The_kth_Factor_of_n {
    public static void main(String[] args) {
        System.out.println(kthFactor(12, 3));
    }
    public static int kthFactor(int n, int k) {
        int count = 0;
        int ans = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
                ans = i;
            }
            if(count>=k) return ans;
        }

        return -1;
    }
}
