package Problem2;

public class AirLavaDino extends Dinosur {
	private float locospeed;
	private int wings;
	private float sw;
	private float ash;
	private int speed;
	public AirLavaDino(String species, String locomotionType, float locomotionSpeed, int numberOfWings,
			float speedPerWing, float ashResistance) {
		super(species,locomotionType,locomotionSpeed);
		this.locospeed=super.getLocomotiveSpeed();
		this.wings=numberOfWings;
		this.sw=speedPerWing;
		this.ash=ashResistance;
	}
   void displayDinoSpeed  ()
   {
	   speed=(int)this.locospeed +
               (this.wings*(int)this.sw)
               - (int)this.ash;
	   System.out.print(speed+" Km/h");
   }
	
	}


