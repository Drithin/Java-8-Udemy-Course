package methodsAndMoreMethods;

public class methods {
	
	/*
	 * In this program, UNDERSTAND that output of one method is input to
	 * another method, i.e, output (return values) of calculateHighScore method
	 * is input to displayHighScorePosition. calculateHighScore method has been assigned
	 * to an integer var and that var is passed into displayHighScorePosition in place of
	 * score table position
	 */
	
   

	public static void displayHighScorePosition(String playerName, int scoreTablePosition){
		System.out.println("The player " + playerName + " has managed to score the position "
		+ scoreTablePosition);
	}
	
	/*
	 * My thought process with the method above is right. My mistake is NOT understand and
	 * listening to the requirement properly. Author asked to return the position (rank). so the author's
	 * code return numbers rather than defining var for it.
	 */
	
	public static int calculateHighScore(int score){
		if(score >= 1000){
			return 1;
		} else if (score >= 500 && score < 1000){
			return 2;
		} else if (score >= 100 && score < 500){
			return 3;
		} else {
			return 4;
		}
	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        
/* 
 * When params are passed to method, we need not define vars explicitly
 * Here same vars are declared in main method and passed again into the
 * method
 */
		
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 100;
			return finalScore;
		
		}
		
		return -1;
	}

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println(" Your final score was "+ highScore);
/*
 * These vars are created when we add params to method with datatypes, java creates them 
 * for us automatically
 */
		
		 score = 10000;
		 levelCompleted = 8;
		 bonus = 200;
		

		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println(" Your final score was "+ highScore);
		
		/*
		 * Here we can replicate the vars and method calls, with out reinitializing
		 * the vars, one time call and multiple uses
		 */
		
		
		/*
		 * Here both cases of calculateScore method use same method and logic defined in 
		 * calculateScore method
		 */
		
		int highScorePosition = calculateHighScore(1500);
		displayHighScorePosition("Tim", highScorePosition);
		
		highScorePosition = calculateHighScore(900);
		displayHighScorePosition("Ron", highScorePosition);
		
		highScorePosition = calculateHighScore(400);
		displayHighScorePosition("Rum", highScorePosition);
		
		highScorePosition = calculateHighScore(50);
		displayHighScorePosition("Jim", highScorePosition);
		

}


}
