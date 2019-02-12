public class SortSearch {

    public static void insertionSort(int[] a)
    {
        for(int i = 1; i<a.length; i++)
        {
            int val = a[i];
            int j = i - 1;

            while(j >= 0 && a[j] > val)
            {
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = val;
        }
    }

    public static int binarySearch(int[]a, int value)
    {
        boolean found=false;

        int left=0;
        int right = a.length;
        int mid = right/2;

        while(!found && left<=right)
        {
            if(a[mid]==value)
                found=true;
            else
            {
                if(a[mid]>value)
                {
                    right=mid-1;
                    mid=right/2;
                }
                else
                {
                    left=mid+1;
                    mid=(right+left)/2;
                }
            }
        }

        if(found)
            return mid;
        else
            return -1;
    }
}
