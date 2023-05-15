
public class BuyandSell {

    static void buyandsell(int[]arr,int n)
    {
        int min=0;
        int profit=0;
        for(int i=0;i<n;i++)
        {
            int cost=arr[i]-min;
            profit=Math.max(cost, profit);
            min=Math.min(min,arr[i]);
        }
    }

    public static void main(String[] args) {
        int[]arr={7,1,5,3,6,4};
        int n=arr.length;
        buyandsell(arr, n);
    }
    
}
