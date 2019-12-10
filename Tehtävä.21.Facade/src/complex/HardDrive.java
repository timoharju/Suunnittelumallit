package complex;

public class HardDrive {
	
    public byte[] read(long lba, int size) { 
    	byte[] bytes = new byte[size];
    	for(int i = 0; i < size; i++) {
    		bytes[i] = (byte)(i+(int)lba);
    	}

    	return bytes;
    }
}
