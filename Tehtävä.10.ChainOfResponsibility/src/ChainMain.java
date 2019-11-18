
public class ChainMain {

	public static void main(String[] args) {
		RaiseRequest r = new RaiseRequest(2);
		Manager officeManager = new OfficeManager();
		Manager regManager = new RegionalManager();
		Manager ceo = new CEO();
		officeManager.setSuccessor(regManager);
		regManager.setSuccessor(ceo);
		
		officeManager.handleRequest(r);
		r.setPercentage(3);
		officeManager.handleRequest(r);
		r.setPercentage(5);
		officeManager.handleRequest(r);
	}

}
