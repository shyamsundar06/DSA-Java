import java.util.*;

public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int total = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int leftSum = 0;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int rightSum = total - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println(i);
                found = true;
                break;
            }

            leftSum += arr[i];
        }

        if (!found) {
            System.out.println("-1");
        }
    }
}