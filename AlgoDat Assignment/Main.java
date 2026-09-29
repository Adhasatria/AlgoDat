
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Band band = new Band();

        car.insertValue("Toyota");
        car.insertValue("Mercedes");
        car.insertValue("Subaru");
        car.insertValue("BMW");

        car.display();

        System.out.println();

        band.insertValue("King Crimson");
        band.insertValue("Rush");
        band.insertValue("Deep Purple");
        band.insertValue("Moody Blues");

        band.display();


        
    }
}
