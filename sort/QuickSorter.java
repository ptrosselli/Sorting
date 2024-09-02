public class QuickSorter<T extends Comparable<T>> extends SortingAlgorithm<T> implements Sorter<T>{

    public QuickSorter(T[] a) {
        super(a);
    }

    private void swap(T[] arr, int first, int last) {
        T temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    private int partition(T[] arr, int low, int high) {
        T pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    private void quickSort(T[] a, int low, int high) {
        if (low < high) {
            int p = partition(a, low, high);
            quickSort(a, low, p - 1);
            quickSort(a, p + 1, high);
        }
    }

    @Override
    public void sort() {
        T[] arr = super.getArr();
        quickSort(arr, 0, arr.length - 1);
    }
}