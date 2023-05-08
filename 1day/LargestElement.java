import java.util.Scanner;

public class LargestElement{

    //In this we will find the largest element in array.


    // this is the function which will be called for finding the largest element in array.
    public static int largestElement(int[]arr ,int size)
    {
        int max=arr[0];   //initialise max with the first element
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)      //comparasion of each element
            {
                max=arr[i];     // as it find the largest element it will be changed 
            }


        }
        return max;             //this will return the max element.

    }

    public static void main(String[] args) {
        System.out.println("enter the size of array");

        Scanner st= new Scanner(System.in);
        int n=st.nextInt();
        System.out.println("enter the array elements");
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=st.nextInt();
        }
   

        System.out.println(largestElement(arr, n));

        
    }



}