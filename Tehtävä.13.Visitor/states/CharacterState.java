package states;

import app.Character;

public interface CharacterState {
	public void action1();
	public void action2();
	public void levelUp(Character character);
}
