public class SortAlgorithms {

    // Insertion Sort
    public static void insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int temp = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > temp) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = temp;
        }
    }

    // Bubble Sort
    public static void bubbleSort(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    swap(A, j, j + 1);
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            int least = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[least]) {
                    least = j;
                }
            }
            if (i != least) {
                swap(A, i, least);
            }
        }
    }

    // Swap method
    public static void swap(int[] A, int pos1, int pos2) {
        int temp = A[pos1];
        A[pos1] = A[pos2];
        A[pos2] = temp;
    }

    // Main method to test
    public static void main(String[] args) {
        int[] A = {27, 12, 3, 18, 11, 7};

        System.out.println("Original Array:");
        printArray(A);

        // You can test any sort here
//        insertionSort(A);
         bubbleSort(A);
//         selectionSort(A);

        System.out.println("Sorted Array:");
        printArray(A);
    }

    // Helper method to print array
    public static void printArray(int[] A) {
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
