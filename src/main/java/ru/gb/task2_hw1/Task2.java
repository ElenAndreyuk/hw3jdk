package ru.gb.task2_hw1;
/*
– Описать собственную коллекцию – список на основе массива. Коллекция должна иметь
возможность хранить любые типы данных, иметь методы добавления и удаления элементов.

Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
 */
public class Task2 {
    public static void main(String[] args) {
        MyCollection<Integer> collection = new MyCollection<>();
        collection.add(1);
        collection.add(1);
        System.out.println(collection);
        collection.remove();
        System.out.println(collection);


    }
}
