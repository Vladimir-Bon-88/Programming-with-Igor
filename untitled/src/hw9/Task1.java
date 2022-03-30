package hw9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    private static List<String> listString = new ArrayList<>();
    private static Map<String, Integer> map = new HashMap<>();

    public static void numberUniqueWords(List<String> list) {
        for (String str : list) {
            if (map.containsKey(str)) {
                Integer temp = map.get(str) + 1;
                map.put(str, temp);
            } else {
                map.put(str, 1);
            }
        }
    }

    public static void numberUniqueWords2(List<String> list) {
        for (String str : list) {
            int value = map.getOrDefault(str, 0) + 1;
            map.put(str, value);
        }
    }

    public static void main(String[] args) {
        listString.add("word1");
        listString.add("word2");
        listString.add("word3");
        listString.add("word1");
        listString.add("word4");
        listString.add("word4");
        listString.add("word5");
        listString.add("word6");
        listString.add("word7");
        listString.add("word2");

        numberUniqueWords2(listString);
        System.out.println(map);


        /*Set<String> set = new HashSet<>(listString);
        System.out.println("Unique objects: ");
        System.out.println(set);
        System.out.println();

        for (String str : set) {
            System.out.println("Number of the " + "'" + str + "'" + " word: " + Collections.frequency(listString, str));
        }
*/

    }
}
