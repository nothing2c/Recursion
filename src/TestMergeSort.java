public class TestMergeSort {
    public static void main(String[] args) {

        int[] numbers = {1,6,78,43,23,12,78,99,6,4};

        MergeSort.mergeSort(numbers);

        for(int i : numbers)
            System.out.print(i+", ");
    }
}
