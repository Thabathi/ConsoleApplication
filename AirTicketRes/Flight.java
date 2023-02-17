package AirTicketRes;

	import java.util.ArrayList;
	import java.util.List;

	public class Flight {
	    private String flightNumber;
	    private String departure;
	    private String arrival;
	    private String date;
	    
	    
	    
		public Flight(String flightNumber, String departure, String arrival, String date) {
			super();
			this.flightNumber = flightNumber;
			this.departure = departure;
			this.arrival = arrival;
			this.date = date;
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

	   
	}



