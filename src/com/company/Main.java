package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       /*-------- hash map ------------
       *
       * Использовать, когда не важен порядок и сортировка
       *
       * */
        Map<Integer, String> hashMap = new HashMap<>(); //внутри не гарантируется порядка
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // в каком порядке добавляли пары, в таком они и вернутся
        Map<Integer, String> treeMap = new TreeMap<>(); //пары будут отсортированы по ключу (естественный порядок)

        testMap(treeMap);


        System.out.println("----------------------------------");

        }
        public static void  testMap(Map<Integer, String> map)
        {
            map.put(39, "Bob");
            map.put(22, "Mike");
            map.put(2, "Phill");
            map.put(49, "Sam");
            map.put(9, "Frodo");
            map.put(280, "Leo");

            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());

            }
        }
}
