package Problem2;

public class Dinosur {
   private String species;
   private String locomotion;
   private float locomotiveSpeed;
   private float speed;
   public Dinosur(String spe,String loco,float locospeed)
   {
	   this.species=spe;
	   this.locomotion=loco;
	  this.locomotiveSpeed=locospeed;	   
   }
public String getSpecies() {
	return species;
}
public void setSpecies(String species) {
	this.species = species;
}
public String getLocomotion() {
	return locomotion;
}
public void setLocomotion(String locomotion) {
	this.locomotion = locomotion;
}
public float getLocomotiveSpeed() {
	return locomotiveSpeed;
}
public void setLocomotiveSpeed(float locomotiveSpeed) {
	this.locomotiveSpeed = locomotiveSpeed;
}
public void display()
{
	System.out.println("\nDino Details");
	System.out.println("Species :"+species);
	
	System.out.print("Travels by "+locomotion+" at a Speed of ");
}
}
