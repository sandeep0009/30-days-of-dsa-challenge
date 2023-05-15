public class Kadanes {

    /*
     * in this we have to return subarray with maximum sum.
     *
     * brute force approach
     */

    // static void maxmimumarray(int[] arr, int n) {

    //     int maxi = Integer.MIN_VALUE;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i; j < n; j++) {
    //             int sum = 0;

    //             for (int k = i; k <=j; k++) {
    //                 sum += arr[k];
    //             }
    //             maxi = Math.max(maxi, sum);

    //         }

    //     }
    //     System.out.println(maxi);
    // }

    /*
     * better approach:
     */

    //  static void maxmimumarray(int[]arr,int n)
    //  {
    //     int maxi=Integer.MIN_VALUE;
    //     for( int i =0;i<n;i++)
    //     {
    //         int sum=0;
    //         for(int j=i;j<n;j++)
    //         {
    //             sum+=arr[j];
    //             maxi=Math.max(maxi, sum);
    //         }
    //         }
           
    //     System.out.println(maxi);
    //  }

    /*
     * optimal is kadanes:
     */
    static void maxmimumarray(int[]arr,int n)
    {
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for( int i=0;i<n;i++)
        {
            sum+=arr[i];
            maxi=Math.max(maxi, sum);
            if(sum>maxi)
            {
                sum=maxi;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        System.out.println(maxi);
    }

    public static void main(String[] args) {
        int[] arr = { -1, -2, 4, -1, 2, 1, -5 };
        int n = arr.length;
        maxmimumarray(arr, n);

    }

}
