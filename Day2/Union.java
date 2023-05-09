package Day2;
import java.util.*;

import java.util.HashSet;

public class Union {

    /*
     * union of set stands for set having unique elemnents of two array.
     * 
     * brute force approach is just take a set and then push all the elements of both array in that set and print it
     */
    static ArrayList<Integer> union(int[]arr1,int[]arr2,int n,int m)
    {
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>Union=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr1[i]);
        }

        for(int i=0;i<m;i++)
        {
            set.add(arr2[i]);
        }


        for(int i:set){
            Union.add(i);

        }
        return Union;
    

    }

    
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={1,2,3,4,5};
        int n=3;
        int m=5;
         System.out.println( union(arr1, arr2, n, m));
    
    }
    
}
