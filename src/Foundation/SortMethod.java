package Foundation;

import Stuff.Item;

import java.util.ArrayList;

public class SortMethod {
    public static void mergeSort(Item[] arr, int low, int high)
    {
        if(low < high)
        {
            int mid = (low + high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void merge(Item[] arr, int low, int mid, int high)
    {
        Item[] left = new Item[mid + 1 - low];
        for(int i = 0; i < left.length; i++)
            left[i] = arr[i + low];
        int leftIndex = 0;
        while(low < mid + 1 && mid + 1 <= high)
        {
            if(arr[mid + 1].getCost() < left[leftIndex].getCost())
            {
                arr[low] = arr[mid+1];
                low++;
                mid++;
            }
            else
            {
                arr[low] = left[leftIndex];
                low++;
                leftIndex++;
            }
        }
        while(low < mid + 1)
        {
            arr[low] =  left[leftIndex];
            low++;
            leftIndex++;
        }
    }

    public static int iterativeBinarySearch(int[] array, int low, int high, int target)
    {
        int mid;
        int count = 0;
        while(low <= high)
        {
            count++;
            mid = (high + low)/2;
            if(array[mid]<target){
                low = mid + 1;
            } else if(array[mid]>target){
                high = mid - 1;
            } else
            {
                return mid;
            }
        }
        return -1;
    }
}
