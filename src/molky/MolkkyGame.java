package molky;

public class MolkkyGame {
	public void knockOver(int... pins) {
		score += onlyOnePin(pins) ? value(pins) : numbers(pins);
	}

	private int numbers(int[] pins) {
		return pins.length;
	}

	private int value(int[] pins) {
		return pins[0];
	}

	private boolean onlyOnePin(int[] pins) {
		return pins.length == 1;
	}

	public int score() {
		return score;
	}
	public boolean testScore() {
		if(score ==50)
		{
			return true;
		}
		else if(score>=50)
		{
			score=25;
		};
		return false;
	}

	private int score;
}