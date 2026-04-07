package lab3.problem5;

public class Sort {

    public static <E> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <E extends Comparable<E>> void bubbleSort(E[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static <E extends Comparable<E>> void mergeSort(E[] array) {
        if (array.length <= 1)
            return;

        int mid = array.length / 2;
        E[] left = (E[]) new Comparable[mid];
        E[] right = (E[]) new Comparable[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    private static <E extends Comparable<E>> void merge(E[] array, E[] left, E[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0)
                array[k++] = left[i++];
            else
                array[k++] = right[j++];
        }
        while (i < left.length)
            array[k++] = left[i++];
        while (j < right.length)
            array[k++] = right[j++];
    }
}