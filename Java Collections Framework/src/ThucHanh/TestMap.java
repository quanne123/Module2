package ThucHanh;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Quan",21);
        treeMap.put("Truong",27);
        treeMap.put("Hoang",96);
        treeMap.put("Nhan",03);
        System.out.println(treeMap);
//        Map<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("Quan" , 21);
//        hashMap.put("Truong" , 21);
//        hashMap.put("Hoang" , 31);
//        hashMap.put("Nhan" , 19);
//        System.out.println("Display entries in hashMap");
//        System.out.println(hashMap + "\n");
    }
}
