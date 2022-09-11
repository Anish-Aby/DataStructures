package list;

import java.util.List;

public class ListUsingArray <T> {
    private int size = 0;
    private int capacity = 10;
    T[] array = (T[]) new Object[capacity];

    public ListUsingArray(int capacity){
        this.capacity = capacity;
    }

    public int getSize(){return size;}

    public boolean isEmpty() { return (size==0);}

    public T get(int index){
        return array[index];
    }

    public T set(int index, T element){
        T temp = array[index];
        array[index] = element;
        return temp;

    }

    public void add(int index, T element){
        for(int i = size-1; i >= index; i--){
            array[i] = array[i+1];
            array[index] = element;
            size++;
        }
    }

    public T remove(int index){
        T temp = array[index];
        for(int i = index; i < size-1;i++) array[i] = array[i+1];
        array[size-1] = null;
        size--;
        return temp;
    }

}
