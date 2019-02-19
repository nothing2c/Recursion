import java.lang.reflect.Array;
import java.util.Arrays;

public class TestArrayMethods {
    public static void main(String[] args) {

        int[] numbers= new int[1000000];

        for(int i=0; i <numbers.length; i++)
            numbers[i] = i;

        //Arrays.sort

        /*long startTime = System.currentTimeMillis();

        Arrays.sort(numbers);

        long endTime = System.currentTimeMillis();

        System.out.println("Arrays.sort: " + (endTime - startTime));*/

        //insertionSort

        /*long startTime = System.currentTimeMillis();

        SortSearch.insertionSort(numbers);

        long endTime = System.currentTimeMillis();

        System.out.println("My insertionSort: " + (endTime - startTime));*/

        //selectionSort

        /*long startTime = System.currentTimeMillis();

        MyArrays.selectionSort(numbers);

        long endTime = System.currentTimeMillis();

        System.out.println("MyArrays.selectionSort: " + (endTime - startTime));*/

        //mergeSort

        long startTime = System.currentTimeMillis();

        MergeSort.mergeSort(numbers);

        long endTime = System.currentTimeMillis();

        System.out.println("My mergeSort: " + (endTime - startTime));
    }
}
