
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length + arr2.length];
        for(int x = 0; x < arr1.length; x++){
            arr3[x] = arr1[x];
        }
        for(int y = arr1.length; y < arr3.length; y++){
            arr3[y] = arr2[y - arr1.length];
        }
        return arr3;
    }
}
