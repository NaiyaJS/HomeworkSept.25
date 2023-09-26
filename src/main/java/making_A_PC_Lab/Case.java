package making_A_PC_Lab;

import javax.swing.tree.AbstractLayoutCache;

public class Case {

  private String model;
  private String manufacturer;
  private String powerSupply;
  private Dimension dimensions;

  public Case(String model, String manufacturer, String powerSupply, Dimension dimensions) {
    this.model = model;
    this.manufacturer = manufacturer;
    this.powerSupply = powerSupply;
    this.dimensions = dimensions;
  }

  /* public Case( String model){
      this.model = model;
    }
    public Case(String manufacturer){
      this.manufacturer = manufacturer;

    }
    public Case(String powerSupply){
      this.powerSupply = powerSupply;
    }
    public Case(Dimension dimensions){
      this.dimensions =dimensions;
    }
    */
  public void pressPowerButton(){
    System.out.println("Power Button Pressed");
  }

  @Override
  public String toString(){
    return "Case: " + '\n'
            + "Model: " + model + '\n'
            + "Manufacturer: " + manufacturer + '\n'
            + "Power Supply: " + powerSupply + '\n'
            + "Dimensions " + dimensions + '\n';
  }
}