package app;

public class CommandMain {

	public static void main(String[] args) {
		Screen screen = new Screen();
		
		Command up = new FlipUpCommand(screen);
		Command down = new FlipDownCommand(screen);
		
		WallButton upButton = new WallButton(up);
		WallButton downButton = new WallButton(down);
		
		upButton.push();
		downButton.push();
	}

}
