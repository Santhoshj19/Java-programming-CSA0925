import java.util.Arrays;
class Largestnumber 
{
    public static void main(String[] args) {
        int[] list = {14, 67, 48, 23, 5, 62};
        int n = 4;

        int nthLargest = findNthLargest(list, n);
        System.out.println("The " + n + "th Largest number: " + nthLargest);
    }

    // Method to find the Nth largest number in an array
    public static int findNthLargest(int[] arr, int n) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the (length - n)th element from the sorted array
        return arr[arr.length - n];
    }
}
