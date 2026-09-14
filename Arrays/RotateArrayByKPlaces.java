
import java.util.*;

class RotateArrayByKPlaces {

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        k = k % arr.length;

        // LEFT ROTATION
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        System.out.println("Left Rotation: " + Arrays.toString(arr));


        /*
        // RIGHT ROTATION

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        System.out.println("Right Rotation: " + Arrays.toString(arr));
        */

    }
}
// import java.util.Arrays;BRUTE FORCE APPROACH
// //TC =O(d+d+(n-d)) => O(n+d)
// //SC=> O(d)
// public class RotateArraybyKplaces {

// 	public static void main(String[] args) {
// 		int[] arr= {1,2,3,4,5,6,7};
// 		int k=3;
		
// 		int temp[]=new int[k];
		
// 		for(int i=0;i<k;i++)
// 		{
// 			temp[i]=arr[i];
// 		}
		
// 		for(int i=k;i<arr.length;i++)
// 		{
// 			arr[i-k]=arr[i];
// 		}
		
// 		int j=0;
		
// 		for(int i=arr.length-k;i<arr.length;i++)
// 		{
// 			arr[i]=temp[j];//use i-(n-d) also
// 			j++;
// 		}
		
// 		System.out.print(Arrays.toString(arr));
// 	}

// }