import java.util.Arrays;
import java.util.Scanner;

public class sorting_logic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i < 5;i++) {
            numbers[i] = sc.nextInt();
        }

        bubbleSort(numbers);
        System.out.println("Bubble Sort: " + Arrays.toString(numbers));

        int[] numbers2 = Arrays.copyOf(numbers, numbers.length);
        selectionSort(numbers2);
        System.out.println("Selection Sort: " + Arrays.toString(numbers2));
    }
    public static void bubbleSort(int[] num) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] num) {
    int n = num.length;

    for (int i = 0; i < n - 1; i++) {
        int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (num[j] < num[idx]) {
                    idx = j;
                }
            }
            int temp = num[idx];
            num[idx] = num[i];
            num[i] = temp;
        }
    }
}

