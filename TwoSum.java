import java.util.*;
public class TwoSum{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int arr1[]= new int[2];
        int target=10;
        int sum;
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    arr1[0] = arr[i];
                    arr1[1] = arr[j];
                }
            }
        }
        System.out.println(arr1[0]+" "+arr1[1]);
    }
}
