package org.example;

import java.util.LinkedList;
import java.util.Random;

public class Pr2 {
    public static void main(String[] args) {
        ex2();
    }
    /*
    2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
     */
    public static void ex2() {
        LinkedList<Integer> linkedList=new LinkedList<>();
        Random random=new Random();
        for (int i = 0; i < random.nextInt(2,20); i++) {
            linkedList.add(random.nextInt(20));
        }
        System.out.println(linkedList);
        int first=0;
        int last=linkedList.size()-1;
        int temp;
        for (int i = 0; i < linkedList.size()/2; i++) {
            temp=linkedList.get(first);
            linkedList.set(first,linkedList.get(last));
            linkedList.set(last,temp);
            first++;
            last--;
        }
        System.out.println(linkedList);
        }


    }
