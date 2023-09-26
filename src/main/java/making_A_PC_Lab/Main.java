package making_A_PC_Lab;

public class Main {
    public static void main(String[] args) {
        Resolution monitorResolution = new Resolution(50, 50);
        Monitor monitor = new Monitor(monitorResolution, " HP ", "HP24m");

        Dimension caseDimensions = new Dimension(200, 200, 100);
        Case pcCase = new Case("windows xp ", "Microsoft", "220 volts", caseDimensions);

        MotherBoard motherBoard = new MotherBoard("sony23", "Sony", 2, 4, "sony-bios");

        PC myPC = new PC(pcCase, motherBoard, monitor);

    myPC.description();
    myPC.powerUp();

    }
}
