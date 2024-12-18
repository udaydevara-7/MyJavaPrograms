import java.util.*;
public class StrongNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        int remainder,originalNumber=number,sum=0;
        while(number!=0){
            remainder=number%10;
            int fact=1;
            for(int i=1;i<=remainder;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            number=number/10;
        }
        if(sum==originalNumber){
            System.out.println("strong number");
        }
        else{
            System.out.println("not strong number");
        }

    }
}