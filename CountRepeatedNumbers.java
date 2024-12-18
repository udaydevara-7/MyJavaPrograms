import java.util.*;
public class CountRepeatedNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> ListOfnumbers=new ArrayList<>();
        ArrayList <Integer> ListOfRepeatedNumbers=new ArrayList<>();
        while(true){
            System.out.println("enter list of numbers");
            int numbers=sc.nextInt();
            if(numbers==-1){
                break;
            }
            ListOfnumbers.add(numbers);
        }
        while(true){
            System.out.println("Enter repeated numbers");
            int numbers=sc.nextInt();
            if(numbers==-1){
                break;
            }
            ListOfRepeatedNumbers.add(numbers);
        }
        for(int i:ListOfnumbers){
            int count=0;
            for(int j:ListOfRepeatedNumbers){
                if(i==j){
                    count++;
                }
            }
            System.out.println(i+"--->"+count);
        }


    }
}