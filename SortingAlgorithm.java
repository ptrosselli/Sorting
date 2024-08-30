public interface SortingAlgorithm<T extends Comparable<T>> {
    /* Get the array stored in the class */
    public T[] getArr();

    /* Update the array to be sorted */
    public void setArr(T[] newArr);

    /* Print the array */
    public void printArr();

    /* Sort the array */
    public void sort();
}