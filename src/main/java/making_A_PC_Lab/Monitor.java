package making_A_PC_Lab;

public class Monitor {

    private String manufacturerName;
    private String modelNumber;
    private Resolution resolution;

    public Monitor( Resolution resolution, String manufacturerName, String modelNumber) {
        this.manufacturerName = manufacturerName;
        this.modelNumber = modelNumber;
        this.resolution = resolution;
    }

    /*   public Monitor(String manufacturerName){
            this.manufacturerName = manufacturerName;
        }

        public Monitor(double modelNumber){
            this.modelNumber = modelNumber;
        }

        public Monitor( Resolution resolution){
            this.resolution = resolution;
        }
    */
    public static void drawPixel(int x, int y, String color ){
        System.out.println("Drawing pixel at" + x + "," + y + "in color" + color);
    }
    // Ensure that you have a string representation of the object
    //this will return Monitor into something readable by a human
    @Override
    public String toString(){
        return "Monitor:" + '\n'
                + "Resolution: " + resolution + '\n'
                + "Model Number: " + modelNumber + '\n'
                + "Manufacturer Name: " + '\n' + manufacturerName;
    }
}
