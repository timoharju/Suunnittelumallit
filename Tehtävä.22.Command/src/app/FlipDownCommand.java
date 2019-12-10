package app;

public class FlipDownCommand implements Command {

	private Screen screen;
	
	public FlipDownCommand(Screen screen) {
		this.screen = screen;
	}
	
	
	@Override
	public void execute() {
		screen.goDown();
	}

}
