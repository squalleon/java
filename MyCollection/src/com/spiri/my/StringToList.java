package com.spiri.my;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringToList {
    public static void main(String[] args) {
        String[] strings = {"Kim", "Lee", "Hong"};
        List<String> list = Arrays.asList(strings);
        Map map = new HashMap<>();
        map.put("list1", list);
        Map map1 = new HashMap();
        map1.put("aa", "aa");
        map1.put("bb", "bb");
        map1.put("cc", "cc");
        map.put("str", "aa");
        map.put("map1", map1);
        System.out.println("result=" + list);

        System.out.println(getKey(map, "bb"));
        System.out.println(getKey(map, "Lee"));

//        if (map.get("list1") instanceof List) {
//            System.out.println("It's List");
//        }
//        if (map.get("map1") instanceof Map) {
//            System.out.println("It's Map");
//        }
//        if (map.get("str") instanceof String) {
//            System.out.println("It's String");
//        }
    }

    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (K key : map.keySet()) {
            if (map.get(key) instanceof List) {
                List list = (List) map.get(key);
                for (Object str : list) {
                    if (value.equals(str)) {
                        return key;
                    }
                }
            }
            if (map.get(key) instanceof Map) {
                ((Map<?, ?>) map.get(key)).keySet();
                Map map1 = (Map) map.get(key);
                if (value.equals(map1.get(value))) {
                    return key;
                }
            }
        }
        return null;
    }
}
