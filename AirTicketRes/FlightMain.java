package AirTicketRes;

import java.util.*;

public class FlightMain {
		 
	    public static void main(String[] args) {
	    	

	        FlightView view = new FlightView();
	        FlightController controller = new FlightController();

	        // Add some initial flights to the model
	       

	        // Prompt user for action
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("1. Add Flight");
	            System.out.println("2. Show Flights");
	            System.out.println("3. Exit");
	            System.out.print("Enter choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                	view.getFlightInfoFromUser();
	                    break;
	                case 2:
	                    controller.showFlights();
	                    break;
	                case 3:
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	            }}}

}
	 
	    