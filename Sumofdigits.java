import java.util.*;
public class Sumofdigits {
    public static void main(String[] args){
        int remainder,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int number=sc.nextInt();
        while(number!=0){
            remainder=number%10;
            sum=sum+remainder;
            number=number/10;
        }
        System.out.println("the sum of digits is"+" "+sum);
    }
}
