public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("BMW i8", "Drake 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Maybach", "Adele 25");
        System.out.println(Car.numberOfCars);
    }
}
