import java.util.Arrays;

public class RepeatedElements {
    public static void main(String[] args) {
        int arr[] = {10, 30, 30, 20, 10, 20, 50, 10};
        int n = arr.length;
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            if (count > 1) {
                System.out.println(arr[i]);
            }
        }
    }
}
