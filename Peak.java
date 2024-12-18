import java.util.*;

public class Peak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Read the number of cadets
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt(); // Read the heights of the cadets
        }

        boolean found = false;

        for (int i = 1; i < n - 1; i++) {
            if (heights[i] > heights[i - 1] && heights[i] > heights[i + 1]) {
                found = true;

                // Move the peak cadet to the front
                int peak = heights[i];
                for (int j = i; j > 0; j--) {
                    heights[j] = heights[j - 1];
                }
                heights[0] = peak;
                break;
            }
        }

        if (found) {
            System.out.println(Arrays.toString(heights));
        } else {
            System.out.println("There are no such cadet");
        }
    }
}