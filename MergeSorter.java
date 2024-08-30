import java.util.Arrays;

public class MergeSorter<T extends Comparable<T>> implements SortingAlgorithm<T>{

    private T[] arr;

    public MergeSorter(T[] a) {
        arr = a;
    }

    @Override
    public T[] getArr() {
        return arr;
    }

    @Override
    public void setArr(T[] newArr) {
        arr = newArr;
    }

    @Override
    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public void merge(T[] a, T[] left, T[] right) {
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

    public void mergeSort(T[] array) {
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

    @Override
    public void sort() {
        mergeSort(arr);
    }
}