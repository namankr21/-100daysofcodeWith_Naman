public class day_18_Merge_Strings_Alternately
{
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "kdiel";
        StringBuilder sb = new StringBuilder();
        int len = s1.length() > s2.length() ? s2.length() : s1.length();
        for(int i=0;i<len;i++)
        {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }
        if(len<s1.length())
        sb.append(s1.substring(len));
        if(len<s2.length())
        sb.append(s2.substring(len));
        System.out.println(sb.toString());
    }
}
