public class Main {
    public static void main(String[] args) {
        float f1 = 1.27f, f2 = 3.881f, f3 = 9.6f;
        int sumFloats = (int) (f1 + f2 + f3);
        System.out.println("Sum of floats as int: " + sumFloats);
        int sumDoubles = Math.round(f1) + Math.round(f2) + Math.round(f3);
        System.out.println("Sum of doubles as int: " + sumDoubles);
    }
}