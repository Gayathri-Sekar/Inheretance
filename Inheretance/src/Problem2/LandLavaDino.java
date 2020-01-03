package Problem2;

public class LandLavaDino extends Dinosur {
    private int feet1;
    private float locospeed;
    private int speed;
	public LandLavaDino(String species, String locomotionType, float locomotionSpeed,int feet) {
		super(species,locomotionType,locomotionSpeed);
		this.feet1=feet;
		this.locospeed=super.getLocomotiveSpeed();
	}
	void displayDinoSpeed ()
	{
		speed=((int)this.locospeed)*feet1;
		System.out.print(speed+" Km/h");
	}

}
