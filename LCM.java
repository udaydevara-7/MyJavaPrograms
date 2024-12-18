import java.util.*;
public class LCM{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int number1=sc.nextInt();
        System.out.println("enter second number");
        int number2=sc.nextInt();
        int lcm=0;
        int MaxNumber=(number1>number2)?number1:number2;
        for(int i=MaxNumber;i<=number1*number2;i++){
            if(i%number1==0 &&i%number2==0){
                lcm=i;
                break;
            }
        }
        System.out.println(lcm);
    }
}