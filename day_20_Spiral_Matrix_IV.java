import java.util.*;
public class day_20_Spiral_Matrix_IV {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][]ans = new int[m][n];
        for(int i=0;i<m;i++) Arrays.fill(ans[i],-1);
        int minr=0,maxr = m-1;
        int minc=0,maxc = n-1;
        while(head!=null)
        {
            for(int i=minc;i<=maxc&&head!=null ;i++)
            {
                ans[minr][i] = head.val;
                head = head.next;
                
            }
            minr++;
            for(int i=minr;i<=maxr&&head!=null ;i++)
            {
                ans[i][maxc] = head.val;
                head = head.next;
                 
            }
            maxc--;
            for(int i=maxc;i>=minc&&head!=null ;i--)
            {
                ans[maxr][i] = head.val;
                head = head.next;
                 
            }
            maxr--;
            for(int i=maxr;i>=minr&&head!=null ;i--)
            {
                ans[i][minc] = head.val;
                head = head.next;
                 
            }
            minc++;
        }
        return ans;
    }
}
