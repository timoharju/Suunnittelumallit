package app;

import states.LevelOne;
import states.LevelThree;
import states.LevelTwo;

public class CharacterVisitor implements Visitor {

	@Override
	public void Visit(Character character) {
		if(character.getState() instanceof LevelOne) {
			if(character.getExperience() > 50) {
				System.out.println("level up!");
				character.levelUp();
			}
		} else if(character.getState() instanceof LevelTwo) {
			if(character.getExperience() > 100) {
				System.out.println("level up!");
				character.levelUp();
			}
		} else if(character.getState() instanceof LevelThree) {
			if(character.getExperience() > 150) {
				System.out.println("level up!");
				character.levelUp();
			}
		}
	}

}
