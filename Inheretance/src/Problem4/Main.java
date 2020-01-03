package Problem4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			   String species;
			   String Consumption;
			   int type;
			   boolean   canBreatheFire;
		       boolean hasHeatResistance;
		       int numberOfWings;
		       int  numberOfScales;
			   Scanner sc=new Scanner(System.in);
			      System.out.print("1. Dinosaur\r\n" + 
			   		"\r\n" + 
			   		"2. Lava Dinosaur\r\n" + 
			   		"\r\n" + 
			   		"3. Dragon Dinosaur");
			      System.out.print("\n\nEnter the type:");
			      type=sc.nextInt();
			      
		    	 // hasHeatResistance=sc.nextBoolean();
			      if(type==1)
			      {   
			    	  System.out.print("Enter Species:");
			    	  species=sc.next();
			    	  System.out.print("Enter Consumption:");
				      Consumption=sc.next();
			    	  System.out.print("\nDino Report\n\n");
			    	  Dinosur d=new Dinosur(species,Consumption);
			    	  System.out.print("Base Dino Properties\n");
			    	  d.display();
			      }
			      else if(type==2)
			      {
			    	  System.out.print("Enter Species:");
			    	  species=sc.next();
			    	  System.out.print("Enter Consumption:");
				      Consumption=sc.next();
				      System.out.print("Breathes fire? (y/n)");
			    	  canBreatheFire=sc.nextBoolean();
			    	  System.out.print("Is heat resistant? (y/n)");
			    	  hasHeatResistance=sc.nextBoolean();
			    	  System.out.print("\nDino Report\n\n");
			    	  LavaDino ld=new LavaDino(species,Consumption,
			    			  canBreatheFire,hasHeatResistance);
			    	  System.out.print("Lava Dino Properties\n");
			    	  ld.display1();
			    	  System.out.print("\nInherited Base Dino Properties\n");
			    	  ld.display();
			      }
			      else if(type==3)
			      {
			    	  System.out.print("Enter Species:");
			    	  species=sc.next();
			    	  System.out.print("Enter Consumption:");
				      Consumption=sc.next();
				      System.out.print("Breathes fire? (y/n)");
			    	  canBreatheFire=sc.nextBoolean();
			    	  System.out.print("Is heat resistant? (y/n)");
			    	  hasHeatResistance=sc.nextBoolean();
			    	  System.out.print("Enter no. of wings:");
			    	  numberOfWings=sc.nextInt();
			    	  System.out.print("Enter no. of scales:");
			    	  numberOfScales=sc.nextInt();
			    	  System.out.print("\nDino Report\n\n");
			    	  DragLava dl=new  DragLava (species,Consumption,canBreatheFire,
			    			  hasHeatResistance,numberOfWings,numberOfScales);
			    		System.out.print("Dragon Dino Properties\n");
			    		dl.display2();
			    		System.out.print("\nInherited Dino Properties\n");
			    		dl.display1();
			    		System.out.print("\nInherited Base Dino Properties\n");
			    		dl.display();
			      }

	}

}
