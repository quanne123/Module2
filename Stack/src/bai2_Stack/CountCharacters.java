package bai2_Stack;

import java.util.*;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.println("Nhập vào chuỗi kí tự");
                String string = sc.nextLine();
                String[] arr = string.split(" ");

                TreeMap<String, Integer> stringMap = new TreeMap<>();
                int countS = 1;
                for (int i = 0; i < arr.length; i++) {
                    if (stringMap.containsKey(arr[i])) {
                        countS++;
                    }
                    else {
                        countS=1;
                    }
                    stringMap.put(arr[i], countS);

                }
                System.out.println("Chuỗi kí tự trùng nhau");
                System.out.println(stringMap);

            }
        }


