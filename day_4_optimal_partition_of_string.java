public class day_4_optimal_partition_of_string {
    public static void main(String[] args) {
        String str = "abacaba";
        System.out.println(partition(str));
    }
    public static int partition(String s) {
        int[]freq = new int[26];
        int count = 1;
        int si = 0;
        int ei = 0;
        while(ei<s.length())
        {
            char ch = s.charAt(ei);
            if(freq[ch-97]==0)
            {
                freq[ch-97]++;
                ei++;
            }
            else
            {
                count++;
                si = ei;
                freq = new int[26];
            }
        }

        return count;
    }
}
