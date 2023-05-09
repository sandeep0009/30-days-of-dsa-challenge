package Day2;

public class linearSearch {
    /*
     * linear search is simple searching technique in which we return the index of target value in array.
     */
    static void Linear(int[]arr,int n,int target)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        Linear(arr, 6, 4);
    }
    
}
