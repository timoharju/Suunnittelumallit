
public class RegionalManager extends Manager {
	
	private final double MAX_RAISE = 5;

	@Override
	public void handleRequest(RaiseRequest request) {
		if(request.getPercentage() < MAX_RAISE) {
			System.out.println("Regional manager will approve " + request.getPercentage() + "% raise.");
		} else if(super.successor != null) {
			super.successor.handleRequest(request);
		}
	}

}
