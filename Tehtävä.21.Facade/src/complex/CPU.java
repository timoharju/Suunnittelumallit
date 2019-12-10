package complex;

public class CPU {
	
    public void freeze() { 
    	System.out.println("Freezing actions");
    }
    
    public void jump(long position) {
    	System.out.println("Jumping to position: " + position);
    }
    
    public void execute() { 
    	System.out.println("Executing..");
    }
}