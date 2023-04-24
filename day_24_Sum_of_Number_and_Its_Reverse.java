public class day_24_Sum_of_Number_and_Its_Reverse {
    /*
        Input: num = 443
        Output: true
        Explanation: 172 + 271 = 443 so we return true.
     */
    public static void main(String[] args) {
        System.out.println(sumOfNumberAndReverse(444));
    }
    public static boolean sumOfNumberAndReverse(int num) {
        for(int i=num/2;i<=num;i++)
        {
            int n = i;
            int r = 0;
            while(n>0)
            {
                r = r*10 + n%10;
                n/=10;
            }
            if(r+i==num) return true;
        }
        return false;
    }
}
