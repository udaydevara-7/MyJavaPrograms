import java.util.*;
public class Gcd{
    public static void main(String[] args) {
        int min, gcd;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int firstNumber = sc.nextInt();
        System.out.println("enter second number");
        int secondNumber = sc.nextInt();
        if (firstNumber > secondNumber) {
            min = secondNumber;
        } else {
            min = firstNumber;
        }
        for (int i = 1; i <= min; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                gcd = i;
                System.out.println("gcd of first number and second number is "+" "+gcd);
            }

        }


    }
}