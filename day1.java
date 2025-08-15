import java.util.*;
class day1{
//Sort an Array of 0s, 1s, and 2s
/*Constraints:
The input array may have up to 105 elements.
The values in the array are limited to 0, 1, and 2.
The sorting algorithm must operate in linear time (i.e., O(n)) and in-place (i.e., without using extra space beyond a few variables).
*/

    public static void soort(int arr[]){
        int low=0;int mid=0;int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,1,0,2,1,0};
        soort(arr);
    }
}
