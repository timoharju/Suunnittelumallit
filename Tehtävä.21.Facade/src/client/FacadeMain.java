package client;

import facade.ComputerFacade;

public class FacadeMain {

	public static void main(String[] args) {
		ComputerFacade computer = new ComputerFacade();
		computer.start();
	}

}
