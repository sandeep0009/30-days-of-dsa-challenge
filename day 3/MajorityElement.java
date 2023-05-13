import java.util.HashMap;
import java.util.*;

public class MajorityElement {

    /*
     * in this question you have to return the maximum occurance of element which
     * shoudl be greater than n/2'
     * such that d>n/2;
     * 
     * brute force approach:
     */

    // static int majorityelement(int arr[], int n) {

    //     for (int i = 0; i < n; i++) {
    //         int count = 0;

    //         for (int j = 0; j < n; j++) {
    //             if (arr[i] == arr[j]) {
    //                 count++;

    //             }
    //         }
    //         if (count > (n / 2)) {
    //             return arr[i];
    //         }
    //     }

    //     return -1;
    // }


    /*
     * better solution is 
     */
    static int majorityelement(int []arr)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int value=map.getOrDefault(arr[i], 0);
            map.put(arr[i],value+1);
        }
        for(Map.Entry<Integer,Integer>it:map.entrySet()){
            if(it.getValue()>(arr.length/2))
            {
                return it.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 1, 2, 2 };
        int n = 6;
        int m = majorityelement(arr);
        System.out.println(m);
    }

}
