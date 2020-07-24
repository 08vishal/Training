package vjs180000;

public class genericBinarySearch<T extends Comparable<T>> {
    public static void main(String[] args) {
        genericBinarySearch<Double> darray= new genericBinarySearch<> ();
        genericBinarySearch<String> sarray= new genericBinarySearch<> ();
        genericMergesort<Double> sortintarray= new genericMergesort<> ();
        Double[]                 arrayOfDoubles = {0.35, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17, 0.30, 0.89, 0.37, 0.66, 0.82, 0.17, 0.20, 0.96, 0.18, 0.25, 0.37, 0.52};

        sortintarray.mergeSort(arrayOfDoubles,0,arrayOfDoubles.length-1);
        System.out.println(java.util.Arrays.toString(arrayOfDoubles));
        System.out.println (darray.binarysearch(arrayOfDoubles,(double).96));
        String[] stringArray = {"Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara", "Nelda", "Blair", "Ernestine", "Chara", "Kareen", "Monty", "Rene", "Cami", "Winifred", "Tara", "Demetrice", "Azucena"};
        genericMergesort<String> stringsort= new genericMergesort<>();
        stringsort.mergeSort(stringArray,0,stringArray.length-1);
        System.out.println(java.util.Arrays.toString(stringArray));
        System.out.println (sarray.binarysearch(stringArray,"Loyce"));

    }
    int binarysearch(T[] stringArray, T target){
        int low=0;
        int high=stringArray.length-1;
        while ((low)<=high){
            int mid=low+(high-low)/2;
            T midval=stringArray[mid];
            int result = target.compareTo(midval);
            if (result < 0) {
                high = mid - 1;
            }

            else if (result > 0) {
                low = mid + 1;
            }

            else {
                return mid;
            }
        }


        return -1;
    }
}
