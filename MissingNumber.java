package Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41,
	                       42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 76, 77, 78, 79,
	                       81, 82, 83, 84, 85, 86, 87, 88, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

	        List<Integer> missingNumbers = findMissingNumbers(array, 100);
	        System.out.println("Missing Numbers: " + missingNumbers);
	    }

	    public static List<Integer> findMissingNumbers(int[] array, int n) {
	        List<Integer> missingNumbers = new ArrayList<>();
	        Arrays.sort(array);
	        
	        for (int num = 1; num <= n; num++) {
	            if (!binarySearch(array, num)) {
	                missingNumbers.add(num);
	            }
	        }
	        
	        return missingNumbers;
	    }

	    public static boolean binarySearch(int[] array, int target) {
	        int start = 0;
	        int end = array.length - 1;

	        while (start <= end) {
	            int mid = start + (end - start) / 2;
	            
	            if (array[mid] == target) {
	                return true;
	            } else if (array[mid] < target) {
	                start = mid + 1;
	            } else {
	                end = mid - 1;
	            }
	        }
	        
	        return false;
	    }
}

