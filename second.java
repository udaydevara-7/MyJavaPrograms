public class second {
    public static void main(String[] args){
        int arr[]={12,45,566,4,32,67,8};
        for(int i=0;i< arr.length;i++){
            int smallest=arr[0];
            int secondSmallest=arr[0];
            if(arr[i]<smallest){
                smallest=arr[i];
                System.out.println("smallest number"+" "+smallest);
            }
            if(arr[i]!=smallest && arr[i]<secondSmallest){
                secondSmallest=arr[i];
                System.out.println("second smallest number is"+" "+secondSmallest);
            }
        }
    }
}
