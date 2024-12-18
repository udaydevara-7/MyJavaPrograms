import java.util.*;
public class Posneg{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number ");
    int number=sc.nextInt();
    if(number>0){
        System.out.println(number+" is positive");
    }
    else if(number<0){
        System.out.println(number+" is negative");
    }
    else{
        System.out.println("you are entered zero");
    }
 }

}