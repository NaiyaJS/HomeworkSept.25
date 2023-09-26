package making_A_PC_Lab;

public class Resolution {
    private int width;
    private  int height;

    public Resolution(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //Ensure you have a String representation of the object
    //this will return Monitor into something readable by a human
    @Override
  public String toString(){
        return "Resolution: " + width + " x " + height + " (width x height)";
  }

}
