import java.util.*;
public class reverseNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        int reverse=0;
        int remainder;
        //loop to find reverse number
        while(number!=0){
            remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        System.out.println("reverse of a number"+" "+number+" "+"is "+reverse);
    }
}