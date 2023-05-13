public class longestSubarray {
    /*
     * subarray means contigous part in an array.
     *  
     * brute force aprroach is taking two for loop and calcualting sum of all sub arrays.
     */

    //  static void bruteforce(int[]arr,int n, int target)
    //  {
      
    //     int length=0;
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=i;j<n;j++)
    //         {
    //             int sum=0;
    //             for(int k=i;k<=j;k++)
    //             {
    //                 sum+=arr[k];            
    //             }
    //             if(sum==target)
    //             {
    //                 length=Math.max(length, j-i+1);

    //             }
               

    //         }
    //     }
    //     System.out.println(length);
    //  }



    //better solution
    // static void bettersolution(int[]arr,int target ,int n)
    // {
    //     int length=0;
    //     for(int i=0;i<n;i++)
    //     {
    //         int sum=0;
            
    //         for(int j=i;j<n;j++)
    //         {
    //             sum+=arr[j];
    //             if(sum==target)
    //             {
    //                 length=Math.max(i+1, length);
    //             }

    //         }
           
    //     }
    //     System.out.println(length);

    // }

    static void subarray(int[]arr,int target)
    {
        int i=0;
        int j=0;
        int sum=arr[0];
        int len=0;
        while(j<arr.length)
        {
            while(i<=j && sum>target )
            {
                sum-=arr[i];
                i++;

            }
            if(sum==target)
            {
                len=Math.max(len,j-i+1);
            }
            j++;
            if(j<arr.length)
            sum+=arr[j];
        }
        System.out.println(len);
    }
     public static void main(String[] args) {
        int[]arr={1,1,-1};
        subarray(arr,1);
     }
    
}
