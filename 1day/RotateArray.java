import java.util.Arrays;

public class RotateArray {

    /*
     * we have to rotate arrray to 1 place left side;
     * 
     */
    static int[] movearray(int[] arr,int n)
    {
        int temp=arr[0];
        for(int i=1;i<n;i++)
       {
        arr[i-1]=arr[i];

       } 
       arr[n-1]=temp;
       return arr;       
    }

   

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(Arrays.toString(movearray(arr, 5)));
    }
    
    
}
