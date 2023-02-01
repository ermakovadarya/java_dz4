package org.example;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args) {

        ex1();
    }

    /*
    1. Реализовать консольное приложение, которое:
    Принимает от пользователя и “запоминает” строки.
    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
    Если введено revert, удаляет предыдущую введенную строку из памяти.
     */
    public static void ex1() {
        LinkedList<String> words = new LinkedList<>();

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.print("Введите строку: ");
            String str = input.nextLine();

            if (str.equals("print")) {
                for (int i = 0; i < words.size(); i++) {
                    System.out.println(words.get(i));
                }
                continue;
            }

            if (str.equals("revert")) {
                try {
                    System.out.println("Строка "+words.get(0)+" удалена");
                    words.removeFirst();
                    continue;
                }
                catch (IndexOutOfBoundsException e){
                    System.out.println("В строке больше нет элементов для удаления");
                    continue;
                }
            }

            if (str.equals("")) {
                System.out.println("Введена пустая строка");
                continue;
            }
            if (str.equals("exit")) {
                break;
            }
            words.addFirst(str);
            System.out.println("Строка "+str+" успешно добавлена");

        }
    }


}
