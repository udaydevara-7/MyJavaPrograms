import java.util.*;
public class Pallindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        int rem,reverse=0,temp;
        temp=number;
        while(number!=0){
            rem=temp%10;
            reverse=reverse*10+rem;
            temp=temp/10;
        }
        if(reverse==number)
            System.out.println("palindrome number");
        else
            System.out.println("not plaindrome");
    }
}

