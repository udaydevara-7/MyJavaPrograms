import java.util.*;
public class FactorialNumber{
    public static void main(String[] args){
        int factorial=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            factorial=factorial*i;
            System.out.println(factorial);
        }
    }
}