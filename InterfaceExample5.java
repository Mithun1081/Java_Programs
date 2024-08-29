package practice_programs_java.bin;

interface GameConfig{
	int MAX_SCORE = 100;
	int MIN_SCORE = 10;
	float VERSION = 1.0f;
}

class Player implements GameConfig{
	void displayScore(int score) {
		if (score>=MAX_SCORE) {
			System.out.println("You've reached the maximum score");
		}
		else if(score<=MIN_SCORE) {
			System.out.println("Minimum score reached");
		}
		else {
			System.out.println("Current score: " + score);
		}
	}
}



public class InterfaceExample5 {
	public static void main(String [] args) {
		Player player = new Player();
		player.displayScore(GameConfig.MAX_SCORE);
	}

}
