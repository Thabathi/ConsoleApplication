package AirTicketRes;

import java.util.List;
	import java.util.Scanner;

	public class FlightView {
		

	
	    public void printFlightDetails(List<Flight> flights) {
	        for (Flight flight : flights) {
	            System.out.println("Flight Number: " + flight.getFlightNumber());
	            System.out.println("Departure: " + flight.getDeparture());
	            System.out.println("Arrival: " + flight.getArrival());
	            System.out.println("Date: " + flight.getDate());
	            System.out.println();
	        }
	    }

	    public Flight getFlightInfoFromUser() {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Enter Flight Number:");
				String flightNumber = scanner.next();
				System.out.println("Enter Departure:");
				String departure = scanner.next();
				System.out.println("Enter Arrival:");
				String arrival = scanner.next();
				System.out.println("Enter Date:");
				String date = scanner.next();
				System.out.println("Number of Seats:");
				int seats= scanner.nextInt();
       return new Flight(flightNumber, departure, arrival, date,seats);
			}
	       
	       
	    }
 public static void main(String[] args) {
	    
	        FlightController controller = new FlightController();
	        

	         
	        try (Scanner scanner = new Scanner(System.in)) {
				while (true) {
				    System.out.println("1. Show Flights");
				    System.out.println("2. Book a Seat");
				    System.out.println("3. Exit");
				    System.out.print("Enter choice: ");
				    int choice = scanner.nextInt();

				    switch (choice) {
				        case 1:
				        	controller.showFlights();
				            break;
				        case 2:
				        	 System.out.print("Enter flight number: ");
			                    String flightNumber = scanner.next();
			                    System.out.print("Enter seat number: ");
			                    int seatNumber = scanner.nextInt();
			                    controller.bookSeat(flightNumber, seatNumber);
			                    break;
				        case 3:
				        	System.out.println("Exiting program...");
		                    break;
				        default:
				        	 System.out.println("Invalid choice. Please try again.");
			                    break;
				    }}
			}}

	}
	
	
	


