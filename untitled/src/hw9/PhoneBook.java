package hw9;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> map;

    public PhoneBook() {
        map = new HashMap<>();
    }

    public PhoneBook(Map<String, List<String>> map) {
        this.map = map;
    }

    public void add(String secondName, String numberOfPhone) {
        List<String> list = new ArrayList<>();
        if (map.containsKey(secondName)) {
            list = map.get(secondName);
            if (!list.contains(numberOfPhone)) {
                list.add(numberOfPhone);
            }
        } else {
            list.add(numberOfPhone);
            map.put(secondName, list);
        }
    }

    public void get(String secondName) {
        System.out.println(secondName + " number(s): " + map.get(secondName));
    }

    public void showInformation() {
        System.out.println("Information about phone book");
        for (Map.Entry<String, List<String>> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
