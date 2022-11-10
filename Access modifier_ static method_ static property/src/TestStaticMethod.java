public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(123, "Quan");
        Student s2 = new Student(124, "Loc");
        Student s3 = new Student(125, "Truong");
        s1.display();
        s2.display();
        s3.display();
    }
}
