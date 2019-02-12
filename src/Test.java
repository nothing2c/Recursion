public class Test {
    public static void main(String[] args) {

        System.out.println(Recursion.myPow(2,4));//16
        System.out.println(Recursion.myPow(8,5));//32768

        System.out.println(Recursion.reverse("Hello"));

        int[] numbers = {1,6,78,43,23,12,78,99,6,4};

        SortSearch.insertionSort(numbers);

        /*for(int i : numbers)
            System.out.print(i+", ");*/

        System.out.println(SortSearch.binarySearch(numbers, 5));//-1
        System.out.println(SortSearch.binarySearch(numbers, 12));//12
        System.out.println(SortSearch.binarySearch(numbers, 1));//1
        System.out.println(SortSearch.binarySearch(numbers, 99));//9
    }
}
