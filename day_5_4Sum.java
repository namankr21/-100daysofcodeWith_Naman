import java.util.*;
public class day_5_4Sum {
    public static void main(String[] args) {
        int[]arr = {1,0,-1,0,-2,2};
        int target = 0;
        
        List<List<Integer>> list = new ArrayList<>();
        list = calculate_sum(arr, target);
        System.out.println(list);

    }
    public static List<List<Integer>> calculate_sum(int[]arr,int target) {
        Set<List<Integer>> list = new HashSet<>();
        Arrays.sort(arr); //Sort the Array
        // to track the quadruplets we require 4 variables i.e. 4 indexes
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1+i;j<arr.length;j++)
            {
                int si = j+1;
                int ei = arr.length-1;
                while(ei>si) // making loop kinda Binary Search 
                {
                    long sum = (long)arr[i] + (long)arr[j] + (long)arr[si] + (long)arr[ei];
                    if(sum==target)
                    {
                        List<Integer> li=  new ArrayList<>();
                        li.add(arr[i]);
                        li.add(arr[j]);
                        li.add(arr[si]);
                        li.add(arr[ei]);
                        list.add(new ArrayList<Integer>(li));
                        ei--;
                        si++;
                    }else if(sum>target) ei--;
                    else si++; 
                }
            }
        }
        return new ArrayList<>(list);
        
    }
}
