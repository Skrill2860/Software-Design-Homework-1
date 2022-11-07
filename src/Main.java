import java.util.Random;

public class Main {
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Task 1:");
        Random random = new Random(System.currentTimeMillis());
        int[] arr = new int[(int)(Math.random() * 10 + 10)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 1000 + 10) * (random.nextBoolean() ? 1 : -1);
        }
        int min = arr[0], max = arr[0], sum = 0;
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
            sum += j;
        }
        printArray(arr);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + (double)sum / arr.length);

        System.out.println("Task 2:");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            double root = Math.sqrt(i);
            for (int j = 2; j <= root; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}