package app;

public class FlipUpCommand implements Command {
	
	private Screen screen;
	
	public FlipUpCommand(Screen screen) {
		this.screen = screen;
	}

	@Override
	public void execute() {
		screen.goUp();
	}

}
