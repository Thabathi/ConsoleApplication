package AirTicketRes;

import java.util.ArrayList;




	class Flight {
	    private String flightNumber;
	    private String departure;
	    private String arrival;
	    private String date;
	    private int seats;
	    private ArrayList<BookingSeats> availableSeats;

	    public Flight(String flightNumber, String departure, String arrival, String date,int seats) {
	        this.flightNumber = flightNumber;
	        this.departure = departure;
	        this.arrival = arrival;
	        this.date = date;
	        this.seats=seats;
	        this.availableSeats = new ArrayList<>();
	    	   for (int i = 1; i <= seats; i++) {
		            availableSeats.add(new BookingSeats(i, "Economy", true));
		        }

	     

	    }

	    public String getFlightNumber() {
	        return flightNumber;
	    }

	    public String getDeparture() {
	        return departure;
	    }

	    public String getArrival() {
	        return arrival;
	    }

	    public String getDate() {
	        return date;
	    }

	    public ArrayList<BookingSeats> getAvailableSeats() {
	        return availableSeats;
	    }
	}




	