import java.util.*;

public class LargestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String largest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                String rev = new StringBuilder(sub).reverse().toString();

                if (sub.equals(rev) && sub.length() > largest.length()) {
                    largest = sub;
                }
            }
        }

        System.out.println(largest);
    }
}