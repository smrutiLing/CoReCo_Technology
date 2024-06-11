package Task;

public class ReverseString {
	    public static void main(String[] args) {
	        String os = "Hello World";   // os - original string
	        String rs = "";              // rs - reversed string
	        for (int i = os.length() - 1; i >= 0; i--) {
	            rs += os.charAt(i);
	        }

	        System.out.println("Reversed String: " + rs);
	    }

}
