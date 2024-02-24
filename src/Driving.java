public class Driving {

    public static void main(String[] args){
        String carName = "Ferrari";
        int carPrice = 1000000;
        double carWeight = 56.78;
        char initials = 'F';
        boolean carAvailable = true;

        System.out.println(carName);
        System.out.println(carPrice);
        System.out.println(carWeight);
        System.out.println(initials);
        System.out.println(carAvailable);

        getInstructionsForDrivingACar();

    }

    public static void getInstructionsForDrivingACar(){

        System.out.println("Step 1: Insert the car keys");
        System.out.println("Step 2: Start the engine");
        System.out.println("Step 3: Press the accelerator");

    }
}
