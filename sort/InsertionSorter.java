public class InsertionSorter<T extends Comparable<T>> extends SortingAlgorithm<T> implements Sorter<T>{

    public InsertionSorter(T[] a) {
        super(a);
    }

    @Override
    public void sort() {
        T[] arr = super.getArr();
        for (int i = 1; i < arr.length; i++) {
            T key = arr[i];
            int j = i - 1;
            while (j >= 0 && key.compareTo(arr[j]) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}