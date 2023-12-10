package ru.gb.task2_hw1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyCollection  <T> implements Iterable<T> {
    private Object[] array;
    int count;

    public MyCollection() {
        array = new Object[1];
        count = 0;
    }
     public void add(T item){
         if (count == array.length){
             Object[] newArr = new Object[array.length * 2];
             System.arraycopy(array, 0, newArr, 0, array.length);
             array = newArr;
         }
         array[count++] = item;
     }


     T remove() {
        if (count == 0) throw new NoSuchElementException();
        T temp = (T) array[--count];
        array[count] = null;
        return temp;
     }

     @Override
    public String toString() {
         return Arrays.toString(array);
         }

    @Override
    public Iterator<T> iterator() {
        return new MyCollectionIterator();
    }

    class MyCollectionIterator implements Iterator<T> {
        int index;

        public MyCollectionIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < count;
        }

        @Override
        public T next() {
            return (T) array[index++];
        }


    }




}
