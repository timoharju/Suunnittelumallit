
public class CEO extends Manager {

	@Override
	public void handleRequest(RaiseRequest request) {
		System.out.println("CEO will approve " + request.getPercentage() + "% raise.");
	}

}
