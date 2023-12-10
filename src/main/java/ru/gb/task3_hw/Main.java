package ru.gb.task3_hw;
/*
Напишите обобщенный метод compareArrays(), который принимает два массива и
возвращает true, если они одинаковые, и false в противном случае.
Массивы могут быть любого типа данных, но должны иметь одинаковую длину
и содержать элементы одного типа.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr3 = {1, 2, 3};
        Double[] arr2 = {1.0, 2.0, 3.0};

        System.out.println(compareArrays(arr1, arr3));

    }
    public static <E> boolean compareArrays(E[] arr1, E[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }else {
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] != arr2[i]){
                    return false;
                }
            }
        }
        return true;

    }
}
