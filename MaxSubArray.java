import java.util.*;
public class MaxSubArray {
    public static void main(String[] args){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int maximumSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int currentSum=0;
            for(int j=i;j< arr.length;j++){
                currentSum=currentSum+arr[j];
                if(currentSum>maximumSum){
                    maximumSum=currentSum;
                }
            }
        }
        System.out.println("maximum subarray"+" "+maximumSum);
    }
}
