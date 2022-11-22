package ThucHanh;

import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("Da Nang");
        collection.add("Ha Noi");
        collection.add("Da Lat");
        collection.add("Hue");

        Iterator iterator = collection.iterator();
        for (Object element : collection) {
            System.out.println(element + " ");
        }
    }
}

