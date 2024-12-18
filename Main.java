import java.util.*;
public class Main{
    public static void main(String[] args){
        String reverse="";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);

    }
}