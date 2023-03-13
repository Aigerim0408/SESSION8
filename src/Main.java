import java.util.Random;

public class Main {
    public static void main(String[] args) {
       Random ran = new Random();
        int[] massiv = new int[10];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = ran.nextInt(1, 20);
            if (massiv[i] % 2 == 0) {
                System.out.println("jup san: " + massiv[i]);
            } else
                System.out.println("tak san: " + massiv[i]);
        }
    }
}