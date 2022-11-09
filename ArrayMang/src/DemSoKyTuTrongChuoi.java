import java.util.Scanner;


public class DemSoKyTuTrongChuoi {


    static void characterCount(String inputString)
    {

        HashMap<Character, Integer> eachCharCountMap = new HashMap<Character, Integer>();
        char[] charArray = inputString.toCharArray();



        for (char c : charArray)
        {
            if(eachCharCountMap.containsKey(c))
            {

                eachCharCountMap.put(c, eachCharCountMap.get(c)+1);
            }
            else
            {
                eachCharCountMap.put(c, 1);
            }
        }



        System.out.println(eachCharCountMap);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        characterCount("Thich Hoc Lai");
        characterCount("Thich Thi Lai");
        characterCount("Thi Qua Mon");
    }

}