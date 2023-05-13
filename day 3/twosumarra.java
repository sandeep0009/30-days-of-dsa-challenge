import java.util.*;
public class twosumarra {

    /*
     * in this question we need to find the index of elements which are equal to target.
     * 
     * brute force :
     * for(int i=0 to n)
     *      for(int j=i+1 to n)
     *          if(arr[i]+arr[j]==target) 
     *                  return i,j
     *
     * hashing:better approach :
     * 
     * HasMap<Integer,Integer>map=new HashMap<>()
     * for(int i=0 to n)
     *      int element=arr[i];
     *         int elemnet required=target-element;
     *          if(map.find)
     * 
     */



     /*
      * two pointers apporach is better option only if we have to return yes or no.
      */

     static void twopointer(int[]arr,int target)
     {
        Arrays.sort(arr);
        int i=0;
        int j=arr.length;
        int sum=0;
        while(i<j)
        {
             sum=arr[i]+arr[j];
            if(sum==target)
            {
                System.out.println("yes");
            }
            else if(sum<target) i++;
            else j--;

        }
        System.out.println("no");
     }

     public static void main(String[] args) {
        int []arr={1,2,3,4,5,5,6};
        int target=11;
        twopointer(arr, target);
     }
    
}
