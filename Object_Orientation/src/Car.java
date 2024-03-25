public class Car {
    public static void main(String[] args) {
        Describe car = new Describe();

        car.setMake("Skoda");
        System.out.println("Car: "+car.getMake());
        System.out.println("model: "+ car.getModel());
        car.DescribeCar();


    }
}

