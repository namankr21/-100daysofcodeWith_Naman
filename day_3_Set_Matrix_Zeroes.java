import java.util.*;
public class day_3_Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][]arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        set_zero(arr);
        for(int i=0;i<arr.length;i++) 
        {
            for(int j=0;j<arr[0].length;j++)
            System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }
    public static void set_zero(int[][]arr) {
        int n = arr.length;
        int m = arr[0].length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(arr[i][j]==0) 
                {
                    list.add(i);
                    list.add(j);
                }
        
        int k = 0;
        while(k<list.size())
        {
            rowtozero(arr,list.get(k),m);
            k++;
            coltozero(arr,list.get(k),n);
            k++;
        }
    }
    public static void rowtozero(int[][] arr,int i,int n)
    {
        for(int k=0;k<n;k++)
        {
            arr[i][k] = 0;
        }
    }
    
    public static void coltozero(int[][] arr,int j,int m)
    {
        for(int k=0;k<m;k++)
        {
            arr[k][j] = 0;
        }
    }
}
