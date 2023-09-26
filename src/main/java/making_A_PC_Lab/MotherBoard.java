package making_A_PC_Lab;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;
 //   String programName = "Photoshop";

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    /*  public MotherBoard(String model){
        this.model = model;
    }
    public MotherBoard(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public MotherBoard(int ramSlots){
        this.ramSlots = ramSlots;
    }
    public MotherBoard(int cardSlots){
        this.cardSlots = cardSlots;
    }
    public MotherBoard(String bios){
        this.bios = bios;
    }
    */


    //create a load Program method that returns nothing but accepts a parameter named programName
    // returns nothing so void
    public void loadProgram(String programName){
        System.out.println("the program " + programName + "is now running...");
    }

    @Override
    public String toString(){
        return "MotherBoard: " + '\n'
                + "model: " + model + '\n'
                + "Manufacturer: " + manufacturer +'\n'
                + "Ram Slots: " + ramSlots + '\n'
                + "Card Slots: " + cardSlots + '\n'
                + "Bios" + bios;
    }

}
