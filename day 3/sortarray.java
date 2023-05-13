import java.util.Arrays;

public class sortarray {
    /*
     * in this we have to sort the array having 0,1,2;
     * 
     * brute force approarch using any sorting technique.
     * 
     * better solution:
     * 
     */

    //  static void sortarray(int []arr,int n)
    //  {
    //     int count0=0;
    //     int count1=0;
    //     int count2=0;
    //     for(int i=0;i<n;i++)
    //     {
    //         if(arr[i]==0)count0++;
    //         else if(arr[i]==1)count1++;
    //         else count2++;

    //     }
    //     for(int i=0;i<count0;i++)
    //     {
    //         arr[i]=0;
    //     }
    //     for(int i=count0;i<count1+count0;i++)
    //     {
    //         arr[i]=1;
    //     }
    //     for(int i=count1+count0;i<n;i++)
    //     {
    //         arr[i]=2;
    //     }
    //     System.out.println(Arrays.toString(arr));
    //  }


    /*
     * dutch national flag algorithm :
     * three pointer approach.
     *   
     * [0 .....low-1]->0 =>extreme left
     * 
     * [0 ......mid-1]->1 
     * 
     * [0 ......n-1]->2 =>extreme right
     *          
     */

     static void ducthnational(int[]arr,int n)
     {
        int mid=0;
        int low=0;
        int high=arr.length-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
         }

     public static void main(String[] args) {
        int []arr={0,1,2,2,2,0,0,0};
        ducthnational(arr, arr.length);
     }
}
