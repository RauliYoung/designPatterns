/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade.tehtava21;

/**
 *
 * @author tristan
 */
public class ComputerFacade {
    private static final long kBootAddress = 0x1000;
    private static final long kBootSector = 0;
    private static final int kSectorSize = 256;
    
    private Cpu cpu;
    private Memory memory;
    private HardDrive hd;

    public ComputerFacade() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.hd = new HardDrive();
    }
    
    
    
    public void start() {
        cpu.freeze();
        char[] bootdata = hd.read(kBootSector, kSectorSize);
        memory.Load(kBootSector, bootdata);
        cpu.jump(kBootAddress);
        cpu.execute();
    }
    
}
