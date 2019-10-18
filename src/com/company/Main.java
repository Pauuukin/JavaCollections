package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       /*-------- Set ------------
       * хрнаят обычные объекты, как и list, но тут нельзя хранить одинаковые элементы
       *
       * */
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Mike");
        hashSet.add("Tom");
        hashSet.add("Ford");
        hashSet.add("Leo");
        hashSet.add("Max");
        //пробуем добавть дубликаты
        hashSet.add("Tom");
        hashSet.add("Tom");


        //вхождение элемента в set
        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Tim"));
        //пустой или нет
        System.out.println(hashSet.isEmpty());

        for (String name : hashSet){
            System.out.println(name);
        }

        System.out.println(hashSet);

        System.out.println("---------------------------------");

        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        //union - объединение множеств
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println(union);

        // intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println(intersection);

        // difference - разность множеств
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println(difference);

    }




}
