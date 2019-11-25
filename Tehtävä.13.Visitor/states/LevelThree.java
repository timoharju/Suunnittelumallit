package states;

import app.Character;

public class LevelThree implements CharacterState {
	
	private static LevelThree instance;
	
	private LevelThree() {
		
	}
	
	public static synchronized CharacterState getInstance() {
		if(instance == null) {
			return instance = new LevelThree();
		} else {
			return instance;
		}
		
	}
	
	@Override
	public void action1() {
		System.out.println("Level 3 action1");
	}

	@Override
	public void action2() {
		System.out.println("Level 3 action2");
	}

	@Override
	public void levelUp(Character character) {
		System.out.println("Maximum level reached");
	}
	
	@Override
	public String toString() {
		return "Level 3";
	}
}
