package app;

import states.CharacterState;
import states.LevelOne;

public class Character {
	
	private CharacterState level;
	private double experience;
	private Visitor visitor;
	
	public Character() {
		level = LevelOne.getInstance();
		experience = 0;
		visitor = new CharacterVisitor();
	}
	
	public void changeLevel(CharacterState level) {
		this.level = level;
	}
	
	public void action1() {
		level.action1();
		experience += 25;
		visitor.Visit(this);
	}
	
	public void action2() {
		level.action2();
		experience += 45;
		visitor.Visit(this);
	}
	
	public void levelUp() {
		level.levelUp(this);
	}
	
	public double getExperience() {
		return experience;
	}
	
	public CharacterState getState() {
		return level;
	}
}
