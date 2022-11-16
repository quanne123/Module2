package bai1_DSAList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList<E> {


    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
   Object elements[];
   public  MyList(){
       elements = new Object[DEFAULT_CAPACITY];
   }
   public  MyList(int capacity) {
       if (capacity >= 0) {
           elements = new Object[capacity];
       } else {
           throw new IllegalArgumentException("capacity: " + capacity);
       }
   }
       public int size(){
           return this.size;
       }
       public void clear(){
       size =0;
       for (int i =0; i<elements.length;i++){
           elements[i] = null;
       }

   }
   public boolean add(E element){
       if(elements.length == size){
           this.ensureCapacity(5);
       }
       elements[size] = element;
       size++;
       return true;
   }
   public void add(E element, int index){
       if (index > elements.length){
           throw new IllegalArgumentException("index: " +index);
       }else if (elements.length == size){
           this.ensureCapacity(5);
       }

       if (elements[index] == null){
           elements[index] = element;
           size++;
       }else {
           for (int i = size+1; i >= index; i--) {
               elements[i] = elements[i-1];

           }
           elements[index] = element;
           size++;

       }
   }

   public void ensureCapacity(int minCapacity){
       if (minCapacity >= 0){
           int newSize = this.elements.length + minCapacity;
           elements = Arrays.copyOf(elements,newSize);
       }else {
           throw new IllegalArgumentException("minCapacity" + minCapacity);
       }
   }
   public E get(int index){
       return (E) elements[index];
   }

   public  int indexOf(E element){
       int index = -1;
       for (int i = 0; i < size ; i++) {
           if (this.elements[i].equals(element)){
               return i;
           }

       }
       return index;
   }

   public boolean contains (E element){
       return this.indexOf(element) >=0;
   }
    public MyList<E> clone(){
       MyList<E> v = new MyList<>();
       v.elements = Arrays.copyOf(elements,size);
       v.size = this.size;
       return v;
    }

    public E remove(int index){
       if (index < 0 ||index > elements.length){
           throw new IllegalArgumentException("Error index: " +index);
       }
       E element = (E) elements[index];
        for (int i = 0; i < size -1; i++) {
            elements[i] = elements[i + 1];

        }
        elements[size -1] = null;
        size --;
        return element;
    }

//    public MyList(int size) {
//        data = (E[]) new Object[size];
//    }
//
//    private void ensureCapa() {
//        if (size > data.length) {
//            int biggerSize = size * 2 + 1;
//            data = Arrays.copyOf(data, biggerSize);
//        }
//
//    }
//
//    public void add(E e) {
//        size += 1;
//        ensureCapa();
//        data[size - 1] = e;
//    }
//
//    public boolean add(E e, int index) {
//        if( index >= 0 && index <= size){
//            size += 1;
//            ensureCapa();
//            for (int i = size -2;i >= index; i--){
//                data[i +1] =data[i];
//            }
//            data[index] = e;
//            return true;
//        }
//        return false;
//    }
//    public E get(int index){
//        if (index >= 0 && index < size){
//            return data[size];
//        }
//        return null;
//    }
//    public MyList clone(){
//        MyList<E> clone = new MyList<>(data.length);
//        for(E x : data) {
//            clone.add(x);
//        }
//        return clone;
//    }
//    public E[] getData(){
//        return this.data;
//    }
//    public int size(){
//        return size;
//    }
//    public boolean remove(int index){
//        if (index >= 0 && index < size){
//            for (int i = index; i < size;i++){
//                data[i] = data[i +1];
//            }
//            size -= 1;
//            return true;
//        }
//        return false;
//    }
//    public void clear(){
//        data = (E[]) new Object[DEFAULT_CAPACITY];
//        size = 0;
//    }
//    public int indexof(E e){
//        for (int i =0; i < size;i++){
//            if (data[i].equals(e)){
//                return i;
//            }
//        }
//        return  -1;
//    }
//    public boolean contains(E e ){
//        for ( E x : data){
//            if (e.equals(x)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//}
}








