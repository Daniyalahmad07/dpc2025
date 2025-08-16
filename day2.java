/*You are given an array arr containing n-1 distinct integers. The array consists of integers taken from the range 1 to n, meaning one integer is missing from this sequence. Your task is to find the missing integer.

Input:
An integer array arr of size n-1 where the elements are distinct and taken from the range 1 to n.
Example : arr = [1, 2, 4, 5]

Output:
Return the missing integer from the array.
Example: Missing number: 3
*/
public class day2 {
    public static void missingNumber(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int x=arr.length+1;
        int sum1=(x*(x+1))/2;
        System.out.println("the missing number is "+ (sum1-sum));
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 4, 5};
        missingNumber(arr);
    }
}
