package Task;

public class PurchaseItemStore {
	
	    public static void main(String[] args) {
	        int[] notes = {3, 2, 1, 1};
	        int price = 40;
	        purchase(notes, price);
	    }

	    public static void purchase(int[] notes, int price) {
	        int[] N = {10, 50, 100, 200};
	        int total = 0;

	        for (int i = 0; i < notes.length; i++) {
	            total += notes[i] * N[i];
	        }

	        System.out.println("Total money: " + total);

	        if (total >= price) {
	            System.out.println("I can purchase");
	        } else {
	            System.out.println("I need more money");
	        }
	    }
}
