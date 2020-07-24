package vjs180000;

import java.util.Arrays;

public class genericMergesort<T extends Comparable<T>> {
    public static void main(String[] args) {
        genericMergesort<String> stringsort= new genericMergesort<>();
        String[] stringArray = {"Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara", "Nelda", "Blair", "Ernestine", "Chara", "Kareen", "Monty", "Rene", "Cami", "Winifred", "Tara", "Demetrice", "Azucena"};
        
        stringsort.mergeSort(stringArray,0,stringArray.length-1);
        System.out.println(Arrays.toString(stringArray));
        Double[]                 arrayOfDoubles = {0.35, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17, 0.30, 0.89, 0.37, 0.66, 0.82, 0.17, 0.20, 0.96, 0.18, 0.25, 0.37, 0.52};
        genericMergesort<Double> doubleSorter   = new genericMergesort<> ();
        doubleSorter.mergeSort(arrayOfDoubles, 0, arrayOfDoubles.length - 1);
        System.out.println(java.util.Arrays.toString(arrayOfDoubles));
    }

    void mergeSort(T[] stringArray, int start, int end) {
        if(start<end){
            int mid=start + ((end-start)/2);

            mergeSort (stringArray,start,mid);
            mergeSort (stringArray,mid+1,end);

            merge(stringArray,start,mid,end);

        }
    }

     void merge(T[] array, int start, int mid, int end) {
        T[] leftArray  = (T[]) new Comparable[mid - start + 1];
        T[] rightArray = (T[]) new Comparable[end - mid];
        for (int i = 0; i < leftArray.length; ++i)
            leftArray[i] = array[start + i];

        // fill in right array
        for (int i = 0; i < rightArray.length; ++i)
            rightArray[i] = array[mid + 1 + i];

        /* Merge the temp arrays */

        // initial indexes of first and second subarrays
        int leftIndex = 0, rightIndex = 0;

        // the index we will start at when adding the subarrays back into the main array
        int currentIndex = start;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length)
        {
            if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) <= 0)
            {
                array[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            }
            else
            {
                array[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }
        while (leftIndex < leftArray.length) array[currentIndex++] = leftArray[leftIndex++];


        while (rightIndex < rightArray.length) array[currentIndex++] = rightArray[rightIndex++];
    }
}
