package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*переменная должна реализовывать главный интерфейс, чтобы можно было поменять реализацию на ходу(exe: array -> linked)
        * поэтому заводим переменную типа List, a не ArrayList, хотя работать будет и так и так*/
        List<Integer> list = new ArrayList();
        for(int i=0; i<10; i++){
            list.add(i);
        }
//        медленное удаление
        list.remove(5);
        System.out.println(list);

/*      ---  бежим по массиву  ---
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(Integer x : list)
            System.out.println(x);
            -------------------------
*/

//        System.out.println(list);
//        System.out.println(list.get(99));
//        System.out.println(list.size());
    }
}
