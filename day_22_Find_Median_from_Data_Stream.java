import java.util.*;
public class day_22_Find_Median_from_Data_Stream
    {
    private List<Integer> li; 
    public void MedianFinder() {
        li = new ArrayList<>();
    }
    
    public void addNum(int num) {
        if(li.size()==0) li.add(0,num);
        else
        {
            int i=0;
            while(li.get(i) <= num && i<li.size()-1) i++; // adding elements in the way such that it is in assending order!!
            //*****The reason why I didn't traversed till the last index was to escape from IndexOutOfBounds Error*****
            if(li.get(i) <= num) li.add(i+1, num);
            else li.add(i, num);
        }
    }
    
    public double findMedian() {
        int len = li.size();
        if(len==0) return 0;
        if(len%2==0)
        {
            return (double)(li.get(len/2) + li.get(len/2 - 1))/2;
        }
        else
        {
            return (double)(li.get(len/2));
        }
    }
}
