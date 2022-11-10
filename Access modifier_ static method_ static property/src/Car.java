public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name , String engine){
        this.name =name;
        this.engine =engine;
        numberOfCars++;
    }

    public static void main(String[] args) {
        Car car1 = new Car("BMW i8","Drake 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Maybach","Adele 25" );
        System.out.println(Car.numberOfCars);
    }
}
