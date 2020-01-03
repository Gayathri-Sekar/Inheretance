package Problem3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String             hotelName;
		int                noOfSqClaw;
		int                ratePerSqClaw;
		boolean            hasWifi;
		boolean            hasAC;
		Scanner sc=new Scanner(System.in);
		System.out.print("1.Deluxe Room\n2.Deluxe AC Room\n3.Luxury Suite\n");
        int event;
        System.out.print("Choose room:");
        event=sc.nextInt();
        if(event==1)
        {  
        	System.out.print("Enter hotel name:");
        	hotelName=sc.next();
        	System.out.print("Enter room area:");
            noOfSqClaw=sc.nextInt();
            System.out.print("Enter rate/sq claw:");
            ratePerSqClaw=sc.nextInt();
            System.out.print("Hotel has Wifi?");
            hasWifi=sc.nextBoolean();
            System.out.print("Hotel has AC?");
            hasAC=sc.nextBoolean();
        	DeluxeRoom dr=new DeluxeRoom(hotelName,noOfSqClaw,
        			ratePerSqClaw,hasWifi,hasAC);
        	dr.display();
        }
        else if(event==2)
        {
        	System.out.print("Enter hotel name:");
        	hotelName=sc.next();
        	System.out.print("Enter room area:");
        noOfSqClaw=sc.nextInt();
        System.out.print("Enter rate/sq claw:");
        ratePerSqClaw=sc.nextInt();
        System.out.print("Hotel has Wifi?");
        hasWifi=sc.nextBoolean();
        System.out.print("Hotel has AC?");
        hasAC=sc.nextBoolean();
        	DeluxeAcRoom ac=new DeluxeAcRoom(hotelName,noOfSqClaw,
        			ratePerSqClaw,hasWifi,hasAC);
        	ac.display();
        }
        else if(event==3)
        {   System.out.print("Enter hotel name:");
        	hotelName=sc.next();
        	System.out.print("Enter room area:");
            noOfSqClaw=sc.nextInt();
            System.out.print("Enter rate/sq claw:");
            ratePerSqClaw=sc.nextInt();
            System.out.print("Hotel has Wifi?");
            hasWifi=sc.nextBoolean();
            System.out.print("Hotel has AC?");
            hasAC=sc.nextBoolean();
        	SuiteACRoom sr=new SuiteACRoom(hotelName,noOfSqClaw,
        			ratePerSqClaw,hasWifi,hasAC);
        	sr.display();
        }
	}

}
