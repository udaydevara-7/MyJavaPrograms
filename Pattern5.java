import java.util.*;
public class Pattern5 {
    public static void main(String args[]){
        int rows=3; // This is rows numbers
        int column=6;// This is column number
       for(int i=1;i<=rows;i++){
            for(int j=1;j<=column;j++){
                if(j%2==0){
                    System.out.print("Amani ");
                }
                else{
                    System.out.print(j+" ");
                }

            }
            System.out.println("");
        }
    }
}