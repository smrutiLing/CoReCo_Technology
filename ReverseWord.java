package Task;

public class ReverseWord {
	public static void main(String[] args) {
		String os = "Hello World";   // os - original string
        String[] words = os.split(" ");
        String result = "";

        for (String word : words) {
            String rw = "";
            for (int i = word.length() - 1; i >= 0; i--) {
              rw += word.charAt(i); // rw - reversed word
            }
            result +=rw + " ";
        }
        result = result.trim();

        System.out.println("Reversed Words String: " + result);
    }
	
}
