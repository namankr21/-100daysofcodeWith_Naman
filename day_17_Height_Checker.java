import java.util.*;
public class day_17_Height_Checker {
    public static void main(String[] args) {
        int[]h = {1,1,4,2,1,3};
        System.out.println(heightChecker(h));
    }
    public static int heightChecker(int[] h) {
        int ex[] = new int[h.length];
        for(int i=0;i<ex.length;i++) ex[i] = h[i];

        Arrays.sort(ex);
        int count = 0;
        for(int i=0;i<ex.length;i++) 
            if(ex[i] != h[i]) count++;
        return count;
    }
}
