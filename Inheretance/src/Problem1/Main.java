package Problem1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String species;
		String locomotiontype;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Species");
		species=sc.next();
		System.out.println("Enter type");
		locomotiontype=sc.next();
		System.out.println("Is it heat resistant?");
		boolean heatResist;
		heatResist=sc.nextBoolean();
		LavaDino D=new LavaDino(species,locomotiontype,heatResist);
        D.display();
	}

}
