package ThucHanh;

public class Student {
    private String name;
    private int id;
    private String classname;

    public Student() {
    }

    public Student(String name, int id, String classname) {
        this.name = name;
        this.id = id;
        this.classname = classname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

}
