import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MeanMedianMode {
    public static void main(String[] args) {
        int[] arr = {16, 18, 27, 16, 23, 21, 19};

       
        double mean = findMean(arr);
        System.out.println("Mean = " + (int) mean);

        
        double median = findMedian(arr);
        System.out.println("Median = " + (int) median);

        // Mode calculation
        int mode = findMode(arr);
        System.out.println("Mode = " + mode);
    }

    
    public static double findMean(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    
    public static double findMedian(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0) {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            return arr[n / 2];
        }
    }

   
    public static int findMode(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mode = Integer.MAX_VALUE;

        for (int num : arr) {
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = num;
            } else if (frequency == maxFrequency && num < mode) {
                mode = num;
            }
        }

        return mode;
    }
}
