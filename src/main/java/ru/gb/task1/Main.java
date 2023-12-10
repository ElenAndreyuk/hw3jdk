package ru.gb.task1;

import java.io.DataInputStream;

public class Main {
    public static void main(String[] args) {
        String  t = "ololo";
        DataInputStream v = new DataInputStream(System.in);
        Integer k  = 5;
        Task1 task1 = new Task1<>(t, v, k);
        task1.printClass();
    }
}
