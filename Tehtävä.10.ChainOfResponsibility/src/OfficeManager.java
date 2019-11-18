
public class OfficeManager extends Manager {
	
	private final double MAX_RAISE = 2;

	@Override
	public void handleRequest(RaiseRequest request) {
		if(request.getPercentage() <= MAX_RAISE) {
			System.out.println("Office manager will approve " + request.getPercentage() + "% raise.");
		} else if(super.successor != null) {
			super.successor.handleRequest(request);
		}
	}

}
