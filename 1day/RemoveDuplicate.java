import java.util.ArrayList;
import java.util.HashSet;
public class RemoveDuplicate {

    /*
     * in this question we have to remove duplicate from a sorted array
     * in this we have to return the size of array after the duplicate are removed
     * 
     */
    //brute force solution:
    // create a set and add all the elements inside this will remove the duplicate elements.
    // static int duplicate(int[] arr,int n)
    // {
    //     HashSet<Integer>set=new HashSet<>();
    //     for(int i=0;i<n;i++)
    //     {
    //         set.add(arr[i]);
    //     }
    //     return set.size();       
      
    // }

    //optimise solution : two pointer we will use two pointers i and j
    /* i=0
     * and j=1
     * for j=1 to n-1 :
     *   if(arr[j]!=arr[j]):
     *          arr[i+1]=arr[j]
     *          i++
     * return i+1;
     */

     static int duplicate(int[]arr,int n)
     {
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(arr[j]!=arr[i])
            {
                arr[i+1]=arr[j];
                i++;        
            }
        }
        return i+1;
     }

    public static void main(String[] args) {
        int[]arr={1,2,2,3,3,4,4,5};
        System.out.println(duplicate(arr, arr.length));
    }
    
}
