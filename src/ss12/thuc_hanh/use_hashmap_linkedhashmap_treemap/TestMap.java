package ss12.thuc_hanh.use_hashmap_linkedhashmap_treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("nguyen", 37);
        hashMap.put("quyet", 30);
        hashMap.put("cong", 20);
        System.out.println(hashMap);
        System.out.println(hashMap.get("nguyen"));
        System.out.println(hashMap.get("quyet"));
        System.out.println(hashMap.get("cong"));
        Map<String, Integer> treeMap = new TreeMap<String, Integer>(hashMap);
        System.out.println(treeMap);
        System.out.println(treeMap.get("nguyen"));
        System.out.println(treeMap.get("quyet"));
        System.out.println(treeMap.get("cong"));

        Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>(100, 0.75f, true);
        linkedHashMap.put("nguyen", 1997);
        linkedHashMap.put("quyet", 1994);
        linkedHashMap.put("cong di ngu", 2004);
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get("nguyen"));
        System.out.println(linkedHashMap.get("quyet"));
        System.out.println(linkedHashMap.get("cong di ngu"));
    }
}