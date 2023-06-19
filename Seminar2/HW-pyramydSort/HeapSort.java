import java.util.Random;

public class HeapSort {

    public static void main(String[] args) {
        Random random = new Random();
        int length = 15;
        int endPosition = 50;
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            int digit = random.nextInt(endPosition);
            array[i] = digit;
        }

        System.out.print("Origin array: ");
        printArray(array);

        sort(array);

        System.out.print("Sorted array: ");
        printArray(array);
    }

    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static void printArray(int[] arr) {
        for (int digit : arr) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}