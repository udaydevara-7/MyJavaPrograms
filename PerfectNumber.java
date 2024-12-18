import java.util.*;
public class PerfectNumber {
    public static void main(String[] args){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        for(int i=1;i<number;i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if(sum==number){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not perfect number");
        }
    }
}