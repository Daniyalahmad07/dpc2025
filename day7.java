/*You are given an array height[] of non-negative integers where each element represents the height of a bar in a histogram-like structure. These bars are placed next to each other, and the width of each bar is 1 unit. When it rains, water gets trapped between the bars if there are taller bars on both the left and right of the shorter bars. The task is to calculate how much water can be trapped between these bars after the rain.

The amount of water trapped above any bar is determined by the difference between the height of the bar and the minimum height of the tallest bars on its left and right. For example, if a bar is surrounded by taller bars, the water will be trapped above it, filling the space up to the height of the shorter of the two taller bars.
Constraints:
1 ≤ height.length ≤ 2 × 10^5 (The array can have up to 200,000 elements)
0 ≤ height[i] ≤ 10^4 (Each bar height is between 0 and 10,000)

*/
import java.util.*;
public class day7 {
    
public static void trapped(int height[]){
    int n=height.length;
    int leftmax[]=new int[n];
    leftmax[0]=height[0];
    for(int i =1;i<n;i++){
        leftmax[i]=Math.max(height[i],leftmax[i-1]);
    }
    int rightmax[]=new int [n];
    rightmax[n-1]=height[n-1];
     for (int i=n-2;i>=0;i--){
        rightmax[i]=Math.max(rightmax[i+1],height[i]);
     }
     int trappedwatersum=0;
for (int i=0;i<n;i++){
int waterlevel=Math.min(leftmax[i],rightmax[i]);
trappedwatersum+=waterlevel-height[i];
}
System.out.println("the total water trapped is "+trappedwatersum);

}
public static void main(String[] args) {
int height[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};  
    trapped(height);
}}

