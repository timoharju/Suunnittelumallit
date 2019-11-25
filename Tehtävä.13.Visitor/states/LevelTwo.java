package states;

import app.Character;

public class LevelTwo implements CharacterState {
	
	private static LevelTwo instance;
	
	private LevelTwo() {
		
	}
	
	public static synchronized CharacterState getInstance() {
		if(instance == null) {
			return instance = new LevelTwo();
		} else {
			return instance;
		}
		
	}
	
	@Override
	public void action1() {
		System.out.println("Level 2 action1");
	}

	@Override
	public void action2() {
		System.out.println("Level 2 action2");
	}

	@Override
	public void levelUp(Character character) {
		character.changeLevel(LevelThree.getInstance());
	}
	
	@Override
	public String toString() {
		return "Level 2";
	}
}
