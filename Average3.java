import java.util.*;
public class Average3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number1");
        int number1=sc.nextInt();
        System.out.println("enter number2");
        int number2=sc.nextInt();
        System.out.println("enter number3");
        int number3=sc.nextInt();
        int average=(number1+number2+number3)/3;
        System.out.println("average of three numbers is "+" "+average);
    }
}
