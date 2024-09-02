import java.util.Random;
import java.util.Arrays;

class Main<T extends Comparable<T>> {

    public static void main(String args[]) {

        //Integer[] smallSet = new Integer[]{7, 4, 6, 2, 10, 1, 3, 5, 4, 9, 8};

        Integer[] medSet = new Integer[1000];
        Random r = new Random();
        for (int i = 0; i < medSet.length; i++) {
            medSet[i] = r.nextInt();
        }

        
        
        InsertionSorter<Integer> a = new InsertionSorter<>(Arrays.copyOf(medSet, medSet.length));
        long ai = System.nanoTime();
        a.sort();
        long af = System.nanoTime() - ai;
        af = af / 100000;
        System.out.printf("%s %o %s\n", "Insertion sort completed in", af, "milliseconds");

        MergeSorter<Integer> b = new MergeSorter<>(Arrays.copyOf(medSet, medSet.length));
        long bi = System.nanoTime();
        b.sort();
        long bf = System.nanoTime() - bi;
        bf = bf / 1000000;
        System.out.printf("%s %o %s\n", "Merge sort completed in", bf, "milliseconds");

        QuickSorter<Integer> c = new QuickSorter<>(Arrays.copyOf(medSet, medSet.length));
        long ci = System.nanoTime();
        c.sort();
        long cf = System.nanoTime() - ci;
        cf = cf / 1000000;
        System.out.printf("%s %o %s\n", "Quick sort completed in", cf, "milliseconds");
    }

}