public class Numberappearingonce {
    /*
     * we have to return the number which is appearing only one time.
     * we can use brute force approach in that we we will use two loops:
     * for(int i=0 to n):
     *      int num=arr[i];
     *      for(j=0 to n)
     *          if(arr[j]==num)
     *              count++
     *              if(count==1)
     *                  return num;
     * 
     * 
     * and the better approach is to use the hashmap
     * 
     * optimise is to use xor property which states that 
     * 
     *          a^a=0 and a^0=a;
     * 
     * 
     */

     static int missingnumber(int[]arr,int n)
     {
        int xor=0;
        for(int i:arr)
        {
            xor^=i;
        }
        return xor;
     }

     public static void main(String[] args) {
        int[]arr={1,1,2,3,3,4,4,5,5};
        int m=missingnumber(arr,arr.length);
        System.out.println(m);
     }
    
}
