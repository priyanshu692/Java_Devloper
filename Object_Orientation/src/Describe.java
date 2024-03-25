public class Describe {
    private String Make;
    private String model;
    private int door;
    private String color;
    //private String make;

    public int getDoor() {
        return door;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make){
        this.Make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void DescribeCar(){
        System.out.println(
                door+"-door"+
                        color + " " +
                        model+ " "

        );
    }
}
