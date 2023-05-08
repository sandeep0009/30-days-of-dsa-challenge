public class CheckArraySorted {

    /*
     * in this we will check whether the array is sorted or not .
     * and will return true if sorted otherwise false;
     */

     static boolean checkarray(int[]arr,int n)
     {
        for(int i=1;i<n;i++)
        {
            if(arr[i]>=arr[i-1])
            {
              
            }
            else
            {
                return false;
            }
        }
        return true;
       
     }


     public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4};
        System.out.println(checkarray(arr,arr.length));

     }
    
}
