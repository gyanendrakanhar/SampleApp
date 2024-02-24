public class Car {

    private String color;
    private double weight;

    public void diplay(){
        System.out.println("The color of the car is: " + color);
        System.out.println("The weight of the car is: " + weight);

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
