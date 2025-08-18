/*You are given two sorted arrays arr1 of size m and arr2 of size n. Your task is to merge these two arrays into a single sorted array without using any extra space (i.e., in-place merging). The elements in arr1 should be merged first, followed by the elements of arr2, resulting in both arrays being sorted after the merge.

Constraints:
The arrays are sorted in non-decreasing order.
You must not use any extra space beyond a few variables (O(1) space complexity).
1 ≤ m, n ≤ 10^5.
1 ≤ arr1[i], arr2[j] ≤ 10^9.
*/
import java.util.*;
public class day4 {

    public static void mergearr(int arr1[],int arr2[]){
        int gap=(arr1.length+arr2.length)/2+(arr1.length+arr2.length)%2;
        while(gap>0){
        int left=0,right=left+gap;
        while(right<arr1.length+arr2.length){
            if(left<arr1.length && right>=arr1.length){
                if(arr1[left]>arr2[right-arr1.length]){
                    int temp = arr1[left];
                    arr1[left] = arr2[right-arr1.length];
                    arr2[right-arr1.length] = temp;
                }
                
            }
            else if(left>=arr1.length){
                if(arr2[left-arr1.length]>arr2[right-arr1.length]){
                    int temp = arr2[left-arr1.length];
                    arr2[left-arr1.length] = arr2[right-arr1.length];
                    arr2[right-arr1.length] = temp;
                }
                
            }
            else if(left<arr1.length&& right<arr1.length){  
                if(arr1[left]>arr1[right]){
                    int temp = arr1[left];
                    arr1[left] = arr1[right];
                    arr1[right] = temp;
                }
                
            }
            left++;
                right++;
            
        }
        gap = (gap == 1) ? 0 : (gap / 2 + gap % 2);

        }

        for(int val : arr1){
            System.out.print(val+ " ");
        }
        for(int val : arr2){
            System.out.print(val+ " ");
        }
        
    }
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8};
        mergearr(arr1,arr2);

    }
}
