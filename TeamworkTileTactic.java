package Task;

public class TeamworkTileTactic {
	
	    public static void main(String[] args) {
	        System.out.println(possibleBonus(3, 7)); // ➞ true
	        System.out.println(possibleBonus(1, 9)); // ➞ false
	        System.out.println(possibleBonus(5, 3)); // ➞ false
	    }

	    public static boolean possibleBonus(int yourTile, int friendsTile) {
	        if (yourTile >= friendsTile) {
	            return false;
	        }
	        
	        int tileDifference = friendsTile - yourTile;

	        return tileDifference >= 1 && tileDifference <= 6;
	    }

}
