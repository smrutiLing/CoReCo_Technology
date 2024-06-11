package Task;

public class HighestInteger {
	    public static void main(String[] args) {
	        int[] arr1 = {-1, 3, 5, 6, 99, 12, 2};
	        int[] arr2 = {6, 7, 8};

	        System.out.println("Highest in array1: " + findMax(arr1, 0));
	        System.out.println("Highest in array2: " + findMax(arr2, 0));
	    }

	    public static int findMax(int[] array, int index) {	    
	        if (index == array.length - 1) {
	            return array[index];
	        }

	        int maxInRest = findMax(array, index + 1);

	        if (array[index] > maxInRest) {
	            return array[index];
	        } else {
	            return maxInRest;
	        }
	    }
}
