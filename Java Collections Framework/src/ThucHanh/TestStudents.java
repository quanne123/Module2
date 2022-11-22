package ThucHanh;

import java.util.*;

public class TestStudents {
    public static void main(String[] args) {
        Students students1 = new Students("Quan",21,"Da Nang");
        Students students2 = new Students("Truong",21,"Mieu Bong");
        Students students3 = new Students("Hoang",31,"Hai Ho");

        List<Students> lists = new ArrayList<Students>();
        lists.add(students1);
        lists.add(students2);
        lists.add(students3);
        Collections.sort(lists);
        for (Students st :lists
             ) {
            System.out.println(st.toString());

        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists ,ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for (Students st : lists){
            System.out.println(st.toString());
        }
//        Map<Integer ,Students> studentsMap = new HashMap<Integer , Students>();
//        studentsMap.put(1,students1);
//        studentsMap.put(2,students2);
//        studentsMap.put(3,students3);
//        for (Map.Entry<Integer , Students> students : studentsMap.entrySet()){
//            System.out.println(students.toString());
//        }
//        System.out.println( "    Set ");
//        Set<Students> student = new HashSet<Students>();
//        student.add(students1);
//        student.add(students2);
//        student.add(students3);
//        student.add(students2);
//
//        for (Students students: student ) {
//            System.out.println(students.toString());
//
//        }
//


    }
}
