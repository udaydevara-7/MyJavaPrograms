import java.util.*;
public class EvenOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int Number=sc.nextInt();
        if(Number%2==0){
            System.out.println(Number+" is Even");
        }
        else{
            System.out.println(Number+" is odd");
        }
    }
}