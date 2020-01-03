package Problem2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String species;
		String locomotionType;
		float locomotionSpeed;
		int feet;
		int                numberOfFins;
		float              numberOfTails;
		float              lavaMultiplier;
		int                numberOfWings;
		float              speedPerWing;
		float              ashResistance;
		Scanner sc=new Scanner(System.in);
	    
	   // locomotionType=sc.next();
	    
	    
	    System.out.println("1. Land Dino\n2. Aqua Dino\n3. Aerial Dino");
	    System.out.println("Enter your Choice:");
	    int num=sc.nextInt();
        if(num==1)
        {
        	System.out.print("Enter Species:");
        	species=sc.next();
        	System.out.print("Enter type:");
        	locomotionType=sc.next();
        	System.out.print("Enter Speed:");
        	locomotionSpeed=sc.nextFloat();
        	System.out.print("Enter no. of feet:");
        	feet=sc.nextInt();
        	LandLavaDino ld=new LandLavaDino(species,locomotionType,locomotionSpeed,feet);
        	ld.display();
        	ld.displayDinoSpeed();
        }
        else if(num==2)
        {
        	System.out.print("Enter Species:");
        	species=sc.next();
        	System.out.print("Enter type:");
        	locomotionType=sc.next();
        	System.out.print("Enter Speed:");
        	locomotionSpeed=sc.nextFloat();
        	System.out.println("Enter no.of fins");
        	numberOfFins=sc.nextInt();
        	System.out.println("Enter no.of tails");
        	numberOfTails=sc.nextFloat();
        	System.out.println("Enter lavamultiplier");
        	lavaMultiplier=sc.nextFloat();
        	WaterLavaDino wd=new WaterLavaDino(species,locomotionType,locomotionSpeed,
        			numberOfFins,numberOfTails,lavaMultiplier);
        	wd.display();
        	wd.displayDinoSpeed();   	     	
        }
        else if(num==3)
        {
        	System.out.print("Enter Species:");
        	species=sc.next();
        	System.out.print("Enter type:");
        	locomotionType=sc.next();
        	System.out.print("Enter Speed:");
        	locomotionSpeed=sc.nextFloat();
        	System.out.print("Enter no. of wings: ");
        	numberOfWings=sc.nextInt();
        	System.out.print("Enter speed/wing:");
        	 speedPerWing=sc.nextFloat();
        	 System.out.print("Enter ash Resisitance");
    		ashResistance=sc.nextFloat();
    		AirLavaDino ad=new AirLavaDino(species,locomotionType,locomotionSpeed,
    				numberOfWings,speedPerWing,ashResistance);
    		ad.display();
    		ad.displayDinoSpeed();
        }

	}

}
