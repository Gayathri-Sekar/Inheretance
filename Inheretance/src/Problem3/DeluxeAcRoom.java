package Problem3;

public class DeluxeAcRoom extends DeluxeRoom{
	private String hotel;
    private int claw;
    public int derate;
    private boolean sac;
    private boolean swi;
    private int cal;
	public DeluxeAcRoom(String hotelName, int noOfSqClaw, int ratePerSqClaw, boolean hasWifi, boolean hasAC) {
		super(hotelName, noOfSqClaw, ratePerSqClaw,hasWifi,hasAC);
		this.sac=hasAC;
		this.swi=hasWifi;
		this.derate=super.derate;
		
	}
	public void display()
    {
		
		derate=15;
		
		System.out.print(derate);
	   claw=super.getNos();
    	if(sac==true)
    	{
    		derate=derate+50;
    	}
    	cal=claw*derate;
    	System.out.println("\nHotel:"+super.getRoom());
    	System.out.print("Amount: "+cal+" rock");
    }
}
