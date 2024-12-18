import java.util.*;
public class PrimeNumberRange {
    public static void main(String[] args){
        int count;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter starting number ");
        int startNumber=sc.nextInt();
        System.out.println("enter ending number");
        int endNumber=sc.nextInt();
        for(int i=startNumber;i<=endNumber;i++){
            count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0) {
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }


    }
}
