public class day_1_Binary_Search {
    public static void main(String[] args) {
        int[]arr = {-1,0,3,5,9,12};
        int target = 9;
        int answer = BinarySearch(arr,target);
        System.out.println(answer);
    }
    
    public static int BinarySearch(int[]arr,int target)
    {
        int si = 0; //Starting index
        int ei = arr.length-1; //end index
        while(ei>=si)
        {
            int mid = si + (ei-si)/2; //mid index to track the elements
            if(arr[mid]==target)
            {
                return mid;
            }
            else
            {
                if(arr[mid]>target) ei = mid - 1;
                else si = mid +1;
            }
        }
        return -1;
    }
}
