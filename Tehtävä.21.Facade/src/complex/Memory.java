package complex;


public class Memory {
	
    public void load(long position, byte[] data) { 
    	System.out.println("Loading data from position: " + position);
    	System.out.println("Loaded: ");
    	for(int i = 0; i < data.length; i++) {
    		System.out.println("0x00" + i + " " + (char)data[i]);
    	}
    }
}
