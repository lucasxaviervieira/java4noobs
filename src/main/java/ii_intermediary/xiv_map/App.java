package ii_intermediary.xiv_map;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("key", "value");
        map.put("newKey", "new value");

        map.remove("newKey", "does not remove when value is diff");
        map.remove("newKey");

        String existKey = map.get("key");
        String notExistentKey = map.get("notExist");

        System.out.println("Main");

        System.out.println(existKey);
        System.out.println(notExistentKey);

        System.out.println(map.containsKey("key"));

        System.out.println(map);

        System.out.println("iterate map by keys:");
        iterateMapByKeys();
        System.out.println("iterate map by values:");
        iterateMapByValues();
        System.out.println("immutable map:");
        immutableMap();
    }
    public void instances() {
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Map<String, String> treeMap = new TreeMap<>();
    }

    public static void iterateMapByKeys() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("newKey", "new value");
        Set<String> keys = map.keySet();
        for(String key: keys) {
            System.out.println("Key: " + key + "\nValue: " + map.get(key));
        }
    }

    public static void iterateMapByValues() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("newKey", "new value");
        Collection<String> values = map.values();
        for(String value: values) {
            System.out.println("Value: " + value);
        }
    }

    public static void immutableMap() {
        Map<String, String> map = Map.of(
            "key", "value",
            "newKey", "new value"
        );
        // map.put("newNewKey", "new value"); // throw  error (UnsupportedOperationException)

        Collection<String> values = map.values();
        for(String value: values) {
            System.out.println("Value: " + value);
        }
    }
}