package methodsAndMoreMethods;

public class methodOverLoading {

	public static void main(String[] args) {
		int newScore = playerScore("Tim", 1000);
		System.out.println("New Score is equal to "+ newScore);
		
		int newScore2 = playerScore(50);
		System.out.println("Another New Score is equal to "+ newScore2);
		

	}
	
	public static int playerScore(String playerName, int score){
		System.out.println(playerName + " scored "+ score + " points");
		return score*1000;
	}
	
	public static int playerScore(int score){
		System.out.println("Unnamed player scored "+ score + " points");
		return score*1000;
	}
	

}
