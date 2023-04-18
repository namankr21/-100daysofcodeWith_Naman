public class day_15_Length_of_the_Longest_Alphabetical_Continuous_Substring {
    public static void main(String[] args) {
        System.out.println(longestContinuousSubstring("abacaba"));
    }
    public static int longestContinuousSubstring(String s) {
        int ans = 0;
        int len = 1;
        char ch = ' ';
        for(int i=1;i<s.length();i++)
        {
            ch = (char)(s.charAt(i-1) + 1);            
            if((s.charAt(i))==ch)
            {
                len++;
            }
            else
            {
                
                ans = Math.max(ans,len);
                len = 1;
            }
        }
        ans = Math.max(ans,len);
        return ans;
    }
}
