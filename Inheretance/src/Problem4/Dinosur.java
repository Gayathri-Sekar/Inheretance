package Problem4;

public class Dinosur {
    private String species;
    private String Consumption;
	public Dinosur(String species, String consumption) {
		this.species=species;
		this.Consumption=consumption;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getConsumption() {
		return Consumption;
	}
	public void setConsumption(String consumption) {
		this.Consumption = consumption;
	}
	public void display()
	{
		System.out.print(this.species+" is a "+this.Consumption);
	}

}
