package ru.gb.task1;
/*
– Создать обобщенный класс с тремя параметрами (T, V, K). Класс содержит три переменные
типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K), методы
возвращающие значения трех переменных. Создать метод, выводящий на консоль имена
классов для трех переменных класса. Наложить ограничения на параметры типа:
T должен реализовать интерфейс Comparable (классы оболочки, String),
V должен реализовать интерфейс DataInput и расширять класс InputStream,
K должен расширять класс Number
 */

import java.io.DataInput;
import java.io.InputStream;
import java.sql.SQLOutput;

public class Task1 <T extends Comparable, V extends InputStream  & DataInput, K extends Number> {
    private T t;
    private V v;
    private K k;

    public Task1(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public void printClass(){
        System.out.println(t.getClass().getSimpleName());
        System.out.println(v.getClass().getName());
        System.out.println(k.getClass().getSimpleName());
    }


}

