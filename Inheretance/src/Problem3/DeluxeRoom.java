package Problem3;

public class DeluxeRoom extends HotelRoom{
    private String hotel;
    private int claw;
   // protected int derate;
	protected static int derate;
    private boolean sac;
    private boolean swi;
    private int cal;
	public DeluxeRoom(String hotelName, int noOfSqClaw, int ratePerSqClaw,boolean hasWifi,boolean hasAC) {
		super(hotelName, noOfSqClaw, ratePerSqClaw);
		this.sac=hasAC;
		this.swi=hasWifi;
		//this.derate=super.getRatepersq();
		derate=10;
	}
	//protected derate=10;
	
   public void display()
    {
	   claw=super.getNos();
    	if(swi==true)
    	{
    		derate=derate+10;
    	}
    	cal=claw*derate;
    	System.out.println("\nHotel:"+super.getRoom());
    	System.out.print("Amount: "+cal+" rock");
    }
 /*  public int getDerate() {
		return derate;
	}
	public void setDerate(int derate) {
		derate = this.derate;
		System.out.print(derate);
	}*/
   
}
