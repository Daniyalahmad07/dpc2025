import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class day10{

    public static List<List<String>> anagram(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        
      String[] test = { "eat", "tea", "tan", "ate", "nat", "bat" };
      List result = anagram(test);
      System.out.println(Arrays.toString(test) + " -> " + result);

    }

}
