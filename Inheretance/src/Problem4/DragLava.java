package Problem4;

public class DragLava extends LavaDino{
         private int numberOfWings;
         private int  numberOfScales;
	public DragLava(String species,String Consumption,boolean canBreatheFire,
		   boolean hasHeatResistance,int numberOfWings, int numberOfScales) {
		   super(species,Consumption,canBreatheFire,hasHeatResistance);
		   this.numberOfWings=numberOfWings;
		   this.numberOfScales=numberOfScales;
		   
	}
	public int getNumberOfWings() {
		return numberOfWings;
	}
	public void setNumberOfWings(int numberOfWings) {
		this.numberOfWings = numberOfWings;
	}
	public int getNumberOfScales() {
		return numberOfScales;
	}
	public void setNumberOfScales(int numberOfScales) {
		this.numberOfScales = numberOfScales;
	}
    public void display2()
    {
    	System.out.println("Flies with "+numberOfWings+" wings");
    	System.out.println("Has "+numberOfScales+" scales");
    }
}
