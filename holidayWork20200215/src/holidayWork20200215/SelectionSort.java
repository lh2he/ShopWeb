package holidayWork20200215;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {43, 21, 65, 23, 65, 33, 21, 12, 43, 54};

        selectionSort(arr);

        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
