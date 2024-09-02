import java.util.Arrays;

public class MergeSorter<T extends Comparable<T>> extends SortingAlgorithm<T> implements Sorter<T>{

    public MergeSorter(T[] a) {
        super(a);
    }

    @Override
    public void sort() {
        mergeSort(super.getArr());
    }

    private void merge(T[] a, T[] left, T[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }

        while (i < left.length) {
            a[k++] = left[i++];
        }

        while (j < right.length) {
            a[k++] = right[j++];
        }
    }

    private void mergeSort(T[] array) {
        if (array.length <= 1) {
            return;
        }

        int mid = array.length / 2;
        T[] left = Arrays.copyOfRange(array, 0, mid);
        T[] right = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }
}