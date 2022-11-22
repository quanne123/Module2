package ThucHanh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList collection1 = new ArrayList();
        collection1.add("Da Nang");
        collection1.add("Da Lat");
        collection1.add("HCM");
        collection1.add("Ha Noi");
        System.out.println("A list of cities in collection1: ");
        System.out.println(collection1);
        System.out.println("\nIs HCM in collection1? " + collection1.contains("HCM"));
        System.out.println("HCM");
        System.out.println("\n" + collection1.size() + "cities are in collection1 now");

        Collection collection2 = new ArrayList<>();
        collection2.add("Phu Yen");
        collection2.add("Phu Quoc");
        collection2.add("Yen Bai");
        collection2.add("Nha Trang");

        System.out.println("\nA list of cities in collection2: ");
        System.out.println(collection2);

        ArrayList c1 = (ArrayList) collection1.clone();
        c1.addAll(collection2);
        System.out.println("\nCities in collection1 and collection2: ");
        System.out.println(c1);

        c1 = (ArrayList) (collection1.clone());
        c1.retainAll(collection2);
        System.out.println("\nCities in collection1 and collection2: ");
        System.out.println(c1);

        c1 = (ArrayList) (collection1.clone());
        c1.removeAll(collection2);
        System.out.println(c1);
    }
}
