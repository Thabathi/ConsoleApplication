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
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Flight Number:");
 	        String flightNumber = scanner.next();
 	        System.out.println("Enter Departure:");
 	        String departure = scanner.next();
 	        System.out.println("Enter Arrival:");
 	        String arrival = scanner.next();
 	        System.out.println("Enter Date:");
 	        String date = scanner.next();
 	       return new Flight(flightNumber, departure, arrival, date);
	       
	       
	    }
	}



