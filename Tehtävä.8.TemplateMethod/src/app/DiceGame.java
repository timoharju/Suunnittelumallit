package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/**
 * Best of 10 dice throwing game
 * @author Nekuin
 *
 */
public class DiceGame extends Game {
	
	private Map<Integer, Integer> scores;
	private int rounds;
	private Random r;

	@Override
	void initializeGame() {
		scores = new HashMap<>();
		rounds = 0;
		r = new Random();
	}

	@Override
	void makePlay(int player) {
		int score = r.nextInt(6) + 1;
		if(scores.containsKey(player)) {
			scores.put(player, scores.get(player)+score);
		} else {
			scores.put(player, score);
		}
		rounds++;
	}

	@Override
	boolean endOfGame() {
		if(rounds > 9) {
			return true;
		}
		return false;
	}

	@Override
	void printWinnter() {
		int winner = scores.entrySet().stream().max((e1, e2) -> e1.getValue() > e2.getValue() ? 1 : -1).get().getKey();
		System.out.println("winner: Player: " + winner + " score: " + scores.get(winner));
		System.out.println("all players: ");
		scores.forEach((key, value) -> System.out.println("Player: " + key + " score: " + value));
		
	}

}
