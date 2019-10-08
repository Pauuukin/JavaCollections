package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       /*-------- hash map ------------
       *
       * Использовать, когда не важен порядок и сортировка
       *
       * */
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Один");         //Entry
        map.put(2, "Два");          //Entry
        map.put(3, "Три");          //Entry

        System.out.println(map);
        // не может быть дубликатов ключей
        map.put(3,"-три-");
        System.out.println(map);
        System.out.println(map.get(1));

        System.out.println("----------------------------------");

        for(Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
