package making_A_PC_Lab;

public class PC {
    private Case pcCase;
    private MotherBoard motherBoard;
    private Monitor monitor;

    public PC(Case pcCase){
        this.pcCase = pcCase;
    }
    public PC(MotherBoard motherBoard){
        this.motherBoard = motherBoard;
    }
    public PC(Monitor monitor){
        this.monitor = monitor;
    }


    //create a drawLogo method that is private, that accepts no parameters
    // invoke/call  the drawPixel(x,y,z) method on the Monitor's instance variable
    private void drawLogo(){
        Monitor.drawPixel(12,10,"Blue");
    }

    public void description(){
       String message = "Welcome to worst buy below is the description of the pc on sale today" + '\n';
       String caseDescription = "Case: " + pcCase + '\n';
       String monitorDescription = "Monitor: " + monitor + '\n';
       String motherbDescription = "Mother Board: " + motherBoard;

        System.out.println(message + caseDescription + monitorDescription + motherbDescription);
    }

    public void PowerUp(){
        pcCase.pressPowerButton();
        drawLogo();
        pcCase.pressPowerButton();
        motherBoard.loadProgram("Photoshop");
    }

}
