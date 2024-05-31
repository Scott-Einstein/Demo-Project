import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        Random random = new Random();
        int N = random.nextInt(5) + 5;
        Circle[] circles = new Circle[N];
        double minArea = 10000.0, maxDistance = 0.0;
        int ai = 0, di = 0;
        for (int i = 0; i < N; i++) {
            double radius = random.nextDouble() * 2.0 + 1.0;
            double x = random.nextDouble() * 3.0 + 2.0;
            double y = random.nextDouble() * 3.0 + 2.0;
            circles[i] = new Circle(x, y, radius);
            if (circles[i].area() < minArea) {
                minArea = circles[i].area();
                ai = i + 1;
            }
            if (circles[i].distanceToOrigin() > maxDistance) {
                maxDistance = circles[i].distanceToOrigin();
                di = i + 1;
            }
            System.out.printf("Circle #%d: %s", i + 1, circles[i].toString());
        }
        System.out.printf("Circle #%d is the smallest circle, area = %.2f\n",ai,minArea);
        System.out.printf("Circle #%d is the farthest circle, distance to origin = %.2f\n",di,maxDistance);


    }
}