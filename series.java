import java.util.*;
public class series{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of elements");
        int n = sc.nextInt();
        System.out.println("enter first term in the series");
        int firstTerm=sc.nextInt();
        int decrement=1;
        for(int i=0;i<n;i++){
            System.out.print(firstTerm+",");
            firstTerm=firstTerm-decrement;
            decrement++;


        }
    }
}