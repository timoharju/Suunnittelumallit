
public abstract class Manager {
	
	protected Manager successor;
	
	public void setSuccessor(Manager successor) {

		this.successor = successor;

	}
	
	abstract public void handleRequest(RaiseRequest request);
}
