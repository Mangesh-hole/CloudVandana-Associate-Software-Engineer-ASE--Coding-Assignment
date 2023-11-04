import java.lang.*;
import java.util.*;

public class ShuffleArray
{
    static void randomize(int arr[], int m)
      {
        Random n =new Random();
        for(int i = m-1; i > 0; i--)
          {
            int j = n.nextInt(i+1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
        System.out.println(Arrays.toString(arr));
      }   
 public static void main(String args[])
    {
       int[] arr = {1,2,3,4,5,6,7};
       int m = arr.length;
       randomize (arr, m); 
    }
}