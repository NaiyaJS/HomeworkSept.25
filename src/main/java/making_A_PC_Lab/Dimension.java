package making_A_PC_Lab;

public class Dimension {
    private int width;
    private int height;
    private int depth;

    public Dimension(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    /*  public Dimension(int width){
        this.width = width;
    }
    public Dimension(int height){
        this.height = height;
    }
    public Dimension(int depth){
        this.depth = depth;
    }
    */
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

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString(){
        return "Dimensions: " + width + " x " + height + " x " + height + " (width x height x depth)";
    }
}
