import java.util.*;
public class MissingNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String [] parts=input.split(" ");
        List<Integer> numbers=new ArrayList<>();
        for(String part:parts){
            numbers.add(Integer.parseInt(part));
        }
        Collections.sort(numbers);
        int start=numbers.get(0);
        int end=numbers.get(numbers.size()-1);
        List<Integer>MissingNumbers=new ArrayList<>();
        for(int i=start;i<=end;i++){
            if(!numbers.contains(i)){
                MissingNumbers.add(i);
            }
        }
        System.out.println(MissingNumbers);
    }
}