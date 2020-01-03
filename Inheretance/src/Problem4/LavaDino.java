package Problem4;

public class LavaDino extends Dinosur{
	private boolean canBreatheFire;
	private boolean hasHeatResistance;
	public LavaDino(String species,String Consumption,
			boolean canBreatheFire,boolean hasHeatResistance) {
		super(species,Consumption);
		this.canBreatheFire=canBreatheFire;
		this.hasHeatResistance=hasHeatResistance;
	}
	public boolean isCanBreatheFire() {
		return canBreatheFire;
	}
	public void setCanBreatheFire(boolean canBreatheFire) {
		this.canBreatheFire = canBreatheFire;
	}
	public boolean isHasHeatResistance() {
		return hasHeatResistance;
	}
	public void setHasHeatResistance(boolean hasHeatResistance) {
		this.hasHeatResistance = hasHeatResistance;
	}
	public void display1()
	{
      //T-Lava-Rex breathes fire    It is resistant to heat
     if(canBreatheFire==true)
     {
    	 System.out.println(super.getSpecies()+" breathes fire");
     }
     if(hasHeatResistance==true)
     {
    	 System.out.println("It is resistant to heat");
     }

	}

}
