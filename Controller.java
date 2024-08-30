class Controller {
    public static void main(String args[]) {
        MergeSorter<Integer> p = new MergeSorter<>(new Integer[]{2, 5, 1, 3, 4});
        //InsertionSorter<Integer> p = new InsertionSorter<>(new Integer[]{2, 5, 1, 3, 4});
        p.printArr();
        p.sort();
        p.printArr();
    }
}