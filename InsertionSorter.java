public class InsertionSorter<T extends Comparable<T>> implements SortingAlgorithm<T>{

    private T[] arr;

    public InsertionSorter(T[] a) {
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

    @Override
    public void sort() {
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