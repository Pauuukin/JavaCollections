package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
      /*--------- linked list ------------*/
        List<Integer> linkedList = new LinkedList<>();

        //  head -> [0] -> [1] -> [2] -> [3]

        List<Integer> arrayList = new ArrayList<>();

        //  [7][6][0][1][2][3][4][5]

        measureTime(linkedList);
        measureTime(arrayList);
    }
    private static void measureTime(List<Integer> list){

        long start = System.currentTimeMillis();

        for(int i=0; i<100000; i++){
            list.add(0,i); //запись в начало листа
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    /*
    * Добавление элементов в конец листа - arrayList (в два раза)
    * Считывание по индексу (get) - arrayList (в сотни раз быстрее)
    * Добавление элементов в начало листа - linkedList (в сотни раз быстрее, так как не нужно сдвигать весь массив вправо)
    * Удаление - linkedList
    * */

}
