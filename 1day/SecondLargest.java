public class SecondLargest {

    // in this we will find the second largest element in an array.


    //here we will write code for function
    //this is brute-force solution
    // static int Secondlargest(int[]arr,int size)
    // {

    //    int largest=arr[size-1];  //taken this because largest elemnet will be in the end when the elements are in increasing order;
    //    int second=-1;            //will take second variable
    //    for(int i=size-2;i>=0;i--) //loop from last second element to the starting
    //    {
    //     if(arr[i]!=largest)        // this will check whether last second equal to the largest or not
    //     {
    //         second=arr[i];
    //         break;
    //     }
    //    }
    //    return second;
    // }


    // this is optimal solution
    /*
     * in optimal solution we will use two pointer largest and second largest
     * where largest will hold starting value arr[0] and second largest will have -1;
     * then check if(arr[i]>largest):
     *                 second=largest and largest=arr[i]
     *              else if(arr[i]<largest && a[i]>second):
     *                  second=arr[i]
     * 
     */

     static int Secondlargest(int[]arr,int n)
     {
        int largest=arr[0];
        int smallest=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest )
            {
                smallest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>smallest)
            {
                smallest=arr[i];
            }
        }
        return smallest;

     }


    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};    // array declaration
        System.out.println(Secondlargest(arr, 5)); //calling of function
    }
    
}
