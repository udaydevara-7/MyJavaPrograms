import java.util.*;
public class PatternTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("*"+" ");
            }
            System.out.print("\n");
        }
    }
}