import java.util.*;
public class BigNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int number1=sc.nextInt();
        System.out.println("enter Second number");
        int number2=sc.nextInt();
        System.out.println("enter third number");
        int number3=sc.nextInt();
        if(number1>number2&&number1>number3){
            System.out.println("bignumber is"+" "+number1);
        }
        else if(number2>number1&&number2>number3){
            System.out.println("bignumber is"+" "+number2);
        }
        else{
            System.out.println("bigger number is "+" "+number3);
        }
    }
}