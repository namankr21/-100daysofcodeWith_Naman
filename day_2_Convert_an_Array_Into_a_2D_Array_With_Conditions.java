import java.util.*;
public class day_2_Convert_an_Array_Into_a_2D_Array_With_Conditions {
    public static void main(String[] args) {
        
    }
    public static List<List<Integer>> findmatrix(int[] nums)
    {
        List<List<Integer>> list = new ArrayList<>();
        int[]arr = new int[205]; //to find the frequency of elements
        int max = 0; // to track no. of rows in final matrix
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++; //counting frequencies 
            if(arr[nums[i]]>max) max = arr[nums[i]];
            
        }
        for(int i=0;i<max;i++)
        {
            List<Integer> li = new ArrayList<>();
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]!=0) //adding element if freq is not zero
                {
                    li.add((j));
                    arr[j]--;
                }
            }
            list.add(new ArrayList<Integer>(li)); //adding elements to final 2D matrix
        }
        return list;
    }
}
