package Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElement {
	    public static void main(String[] args) {
	        int[] L1 = {56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 88, 72, 73, 74, 75, 76, 77, 78, 79, 80};
	        int[] L2 = {81, 82, 83, 1, 84, 85, 86, 87, 88, 60, 89, 90, 1, 91, 92, 93};

	        List<Integer> commonElements = findCommonElements(L1, L2);
	        System.out.println("Common elements: " + commonElements);
	    }

	    public static List<Integer> findCommonElements(int[] L1, int[] L2) {
	        List<Integer> commonElements = new ArrayList<>();
	        Arrays.sort(L1); // sort binary search

	        for (int num : L2) {
	            if (binarySearch(L1, num)) {
	                commonElements.add(num);
	            }
	        }

	        return commonElements;
	    }

	    public static boolean binarySearch(int[] arr, int target) {
	        int start = 0;
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
