package facade;
import complex.*;

public class ComputerFacade {
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
    	long BOOT_ADDRESS = 1;
    	long BOOT_SECTOR = 10;
    	int SECTOR_SIZE = 100;
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(2);
        processor.execute();
    }
}
