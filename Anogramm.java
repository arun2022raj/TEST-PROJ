import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Anogramm {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> countMap = new HashMap<>();

        // Count occurrences of characters in s1
        for (char c : s1.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Decrement occurrences of characters in s2
        for (char c : s2.toCharArray()) {
            int count = countMap.getOrDefault(c, 0);
            if (count == 0) {
                return false; // Character not present in s1
            }
            countMap.put(c, count - 1);
        }

        // Check if all character counts are zero
        for (int count : countMap.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] list = {"nat", "eat", "tea", "bat", "tan", "ate"};
        ArrayList<ArrayList<String>> arrayList2D = new ArrayList<>();
        boolean[] visited = new boolean[list.length];

        for (int i = 0; i < list.length; i++) {
            if (!visited[i]) {
                ArrayList<String> group = new ArrayList<>();
                group.add(list[i]);
                visited[i] = true;

                for (int j = i + 1; j < list.length; j++) {
                    if (!visited[j] && isAnagram(list[i], list[j])) {
                        group.add(list[j]);
                        visited[j] = true;
                    }
                }

                arrayList2D.add(group);
            }
        }

        System.out.println("Elements of the 2D ArrayList:");
        for (ArrayList<String> row : arrayList2D) {
            System.out.println(row);
        }
    }
}
