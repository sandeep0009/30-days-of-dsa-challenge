import java.util.HashMap;

public class Missingnumber {

    /*
     * in this we have to find the missing number in the array.
     */
    //brute force approach is :taking an for loop 1 to n and other of iteration of array and then check for i and arr[j]

    // static void number(int[]arr,int n)
    // {
    //     int flag=0;

    //     for( int i=1;i<=n;i++)
    //     {
    //         for(int j=0;j<n;j++)
    //        {
    //          if(arr[j]!=i)
    //          {
    //             flag++;
    //             break;
    //          }
    //        } 

    //     }
    //     if(flag==0)
    //     {
    //         System.out.println("no missing");

    //     }
    //     else{
    //         System.out.println("missing number :"+flag);
    //     }
    // }

    

    // static void number(int[]arr ,int m)
    // {
    //     HashMap<Integer,Integer>count=new HashMap<>();
    //     for(int i=0;i<m;i++)
    //     {
    //         count.put(i,arr[i]);
    //     }
    //     for(int i:count.values())
    //     {
    //         if(i==0)
    //         {
    //             System.out.println("missin number"+i);
    //         }

    //     }
        
    // }


    //optimal solution is xor .

        static void number(int[]arr, int N )
        {
            int xor1=0;
            int xor2=0;
            int n=N-1;
           for(int i=0;i<n;i++)
           {
            xor2=xor2 ^arr[i];
            xor1=xor1 ^(i+1);

           }
           xor1=xor1 ^ N;
           System.out.println( xor1 ^xor2);
        }
    public static void main(String[] args) {
        int[]arr={1,2,4,5};
        number(arr ,4);
    }
    
}
