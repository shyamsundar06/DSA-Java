import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String, List<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        for (List<String> group : map.values()) {
            System.out.println(group);
        }
    }
}
