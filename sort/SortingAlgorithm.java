public class SortingAlgorithm<T extends Comparable<T>> {

    private T[] arr;

    public SortingAlgorithm(T[] a) {
        arr = a;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] newArr) {
        arr = newArr;
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}