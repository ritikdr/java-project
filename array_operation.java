import java.util.Scanner;

public class array_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i < 5;i++) {
            numbers[i] = sc.nextInt();
        }

        int max = findMax(numbers);
        System.out.println("Maximum: " + max);
        int min = findMin(numbers);
        System.out.println("Minimum: " + min);
        int sum = arraySum(numbers);
        System.out.println("Sum: " + sum);
        double avg = arrayAvg(numbers);
        System.out.println("Average: " + avg);

    }
    public static int findMax(int[] num) {
        int max = num[0];
        for(int i = 1; i < num.length;i++) {
            if(num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
    public static int findMin(int[] num) {
        int min = num[0];
        for(int i = 1; i < num.length;i++) {
            if(num[i] < min) {
                min = num[i];
            }
        }
        return min;
    }
    public static int arraySum(int[] num) {
        int sum = 0;
        for(int i = 0;i < num.length;i++) {
            sum += num[i];
        }
        return sum;
    }
    public static double arrayAvg(int[] num) {
        int n = num.length;
        int sum = 0;
        for(int i = 0;i < n;i++) {
            sum += num[i];
        }
        return sum / n;
    }
}