package states;

import app.Character;

public class LevelOne implements CharacterState {
	
	private static LevelOne instance;
	
	private LevelOne() {
		
	}
	
	public static synchronized CharacterState getInstance() {
		if(instance == null) {
			return instance = new LevelOne();
		} else {
			return instance;
		}
		
	}

	@Override
	public void action1() {
		System.out.println("Level 1 action");
	}

	@Override
	public void action2() {
		System.out.println("Level 2 action");
	}

	@Override
	public void levelUp(Character character) {
		character.changeLevel(LevelTwo.getInstance());
	}
	
	@Override
	public String toString() {
		return "Level 1";
	}

}
