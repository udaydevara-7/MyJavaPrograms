import java.util.*;
public class SumOfnumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number or Startig number = ");
        int Number1=sc.nextInt();
        System.out.println("enter last number or ending number = ");
        int Number2=sc.nextInt();
        int Sum=0;
        for(int i=Number1;i<=Number2;i++){
            Sum=Sum+i;
        }
        System.out.println("sum of all the numbers you have entered is "+" "+Sum);
    }
}