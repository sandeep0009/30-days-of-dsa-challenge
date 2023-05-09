
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
public class movingallzerotoend {

    /* 
     * in this question we need to move all zero elements to the end
     * brute force approach take an array and push them and then add new array
     * 
     */

    //  static void temporary(int[]arr,int n)
    //  {
    //     int[]temp=new int[n];
    //     int k=0;
    //     for(int i=0;i<n;i++)
    //     {
    //         if(arr[i]!=0)
    //         {
    //             temp[k]=(arr[i]);
    //             k++;
    //         }
    //     }
    //    while(k<n)
    //    {
    //     temp[k]=0;
    //     k++;
    //    }

    //    System.out.println(Arrays.toString(temp));


    //  }

    //optimal solutin is using two pointer approach;






    
    static void temporary(int[]arr,int n)
    {
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++)
        {

            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

     public static void main(String[] args) {
        int[] arr={0,0,0,0,12,3,4,5};
        temporary(arr,arr.length);
     }
    
}
