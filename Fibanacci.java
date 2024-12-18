import java.util.*;
public class Fibanacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        int nextNumber;
        int firstNumber=0;
        int secondNumber=1;
        for(int i=2;i<number;i++){
            nextNumber=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=nextNumber;
            System.out.println(nextNumber);
        }

    }
}