import java.util.*;
public class Swap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int firstNumber=sc.nextInt();
        System.out.println("enter second number");
        int secondNumber=sc.nextInt();
        firstNumber=firstNumber+secondNumber;
        secondNumber=firstNumber-secondNumber;
        firstNumber=firstNumber-secondNumber;
        System.out.println(firstNumber+" "+"and"+" "+secondNumber);
    }
}