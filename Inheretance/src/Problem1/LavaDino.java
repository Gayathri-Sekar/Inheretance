package Problem1;

public class LavaDino extends Dinosur {
    boolean type;
	public LavaDino(String species, String locomotiontype, boolean heatResist) {
		super(species,locomotiontype);
		this.type=heatResist;
	}
    void display()
    {
      if(type==true)	
      {
    	  System.out.print(super.toString()+"\n"+"Lives on underground");
      }
      else
      {
    	  System.out.print(super.toString()+"\n"+"Did not survive");
      }
    }
	
	
	
}
