package org.example;

public class Main {
    public static void main(String[] args) {
        Randoms randoms = new Randoms(10, 100);
        randoms.setOffNum(11);//установка значения отключения итератора
        System.out.println("Использование метода forEachRemaining: ");
        randoms.iterator().forEachRemaining(a -> System.out.println("Значение:" + a));
        System.out.println("Использование цикла:");
        while (randoms.iterator().hasNext()) {
            System.out.println(randoms.iterator().next());
        }
    }
}