package Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumber {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41,
	                     42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 88, 72, 73, 74, 75, 76, 77, 78, 79, 80,
	                     81, 82, 83, 1, 84, 85, 86, 87, 88, 89, 90, 1, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

	        List<Integer> duplicates = findDuplicates(arr);
	        System.out.println("Duplicate elements: " + duplicates);
	    }

	    public static List<Integer> findDuplicates(int[] arr) {
	        List<Integer> duplicates = new ArrayList<>();
	        Arrays.sort(arr); 

	        for (int i = 0; i < arr.length; i++) {
	            if (binarySearch(arr, arr[i], i + 1)) {
	                if (duplicates.isEmpty() || duplicates.get(duplicates.size() - 1) != arr[i]) {
	                    duplicates.add(arr[i]);
	                }
	            }
	        }

	        return duplicates;
	    }

	    public static boolean binarySearch(int[] arr, int target, int start) {
	        int end = arr.length - 1;

	        while (start <= end) {
	            int mid = start + (end - start) / 2;

	            if (arr[mid] == target) {
	                return true;
	            } else if (arr[mid] < target) {
	                start = mid + 1;
	            } else {
	                end = mid - 1;
	            }
	        }

	        return false;
	    }
}
