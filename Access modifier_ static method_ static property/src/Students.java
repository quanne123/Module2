public class Students {
    private String name = "John";
    private String classes = "C02";
    public Students(){
    }
    public Students(String name,String classes){
        this.name = name;
        this.classes =classes;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

}
