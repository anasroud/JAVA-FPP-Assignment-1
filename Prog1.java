import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        double resultPi = (double) Math.pow(Math.PI, random.nextInt(0, 9));
        double resultPowerPi = (double) Math.pow(random.nextInt(3, 14), Math.PI);

        System.out.printf("Pi to the power of a random number between 1 and 9 is:%.2f \n", resultPi);
        System.out.printf("A random number between 3 and 14 to the power of Pi is:%.2f ", resultPowerPi);
    }
}