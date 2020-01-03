package Problem3;

public class SuiteACRoom extends HotelRoom{
	private String hotel;
    private int claw;
    private int derate,derate1;
    private boolean sac;
    private boolean swi;
    private int cal;
	public SuiteACRoom(String hotelName, int noOfSqClaw, int ratePerSqClaw,
			boolean hasWifi, boolean hasAC) {
		super(hotelName, noOfSqClaw, ratePerSqClaw);
		this.sac=hasAC;
		this.swi=hasWifi;
	}
	public void display()
    {
	   derate=super.getRatepersq();
	   derate=25;
	   claw=super.getNos();
    	if(swi==true&&sac==true)
    	{
    		
    		
    		derate=derate+50+75;
    	}
    	else if(swi==true)
    	{
    		derate=derate+50;//if it is no
    	}
    	else if(sac==true)
    	{
    		derate=derate+75;
    	}
    	
    	cal=claw*derate;
    	System.out.println("\nHotel:"+super.getRoom());
    	System.out.print("Amount: "+cal+" rock");
    }

}
