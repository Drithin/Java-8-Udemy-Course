package ifelseConditional;

public class ifelseElseif {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println(" Your final score was "+finalScore);
		}
//		
//		boolean newgameOver = true;
//		int newscore = 10000;
//		int newlevelCompleted = 8;
//		int newbonus = 200;
//		
//		if(gameOver){
//			int newfinalScore = newscore + (newlevelCompleted * newbonus);
//			System.out.println(" Your new final score was "+newfinalScore);
//		}
//		
		
		gameOver = true;
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println(" Your final score was "+finalScore);
		}
		
		/**
		 * here commented code is one way of doing the challenge.
		 * another way is to REUSE the same variables and apply same logic.
		 * NOT advisable because duplicating code may lead to wrong outcomes, 
		 * as we need to update every duplicate copy we made.
		 */

	}

}
