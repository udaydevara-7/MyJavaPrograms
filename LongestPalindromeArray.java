import java.util.Scanner;
import java.util.*;

public class LongestPalindromeArray {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int[] arr = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int largestPalindrome = -1;

        for (int i = size - 1; i >= 0; i--) {
            int n = arr[i];
            int reverse = 0, original = n;

            while (n != 0) {
                int remainder = n % 10;
                reverse = reverse * 10 + remainder;
                n = n / 10;
            }

            if (original == reverse) {
                largestPalindrome = original;
                break;
            }
        }

        if (largestPalindrome == -1) {
            System.out.println("There is no palindrome number in the array");
        } else {
            System.out.println("Largest palindrome number in the array: " + largestPalindrome);
        }
    }
}
