package AirTicketRes;

import java.util.ArrayList;

public class FlightController {
	static ArrayList<Flight>list= new ArrayList<>();
	FlightController()
	{
		 list.add(new Flight("CD456", "bangalore", "mumbai", "2022-03-02"));
	        list.add(new Flight("EF457", "kerala", "chennai", "2022-03-06"));
	        list.add(new Flight("GH458", "dubai", "mumbai", "2022-03-09"));
	        list.add(new Flight("DR234", "bangalore", "chennai", "2022-03-07"));
		
		
	}
	    private Flight model;
	    private FlightView view;

	    public FlightController(Flight model, FlightView view) {
	        this.model = model;
	        this.view = view;
	    }

	    public void addFlight(Flight flight) {
	  
	        list.add(flight);
	    }

	    public void showFlights() {
	     for(Flight ft: list)
	    {
	    	System.out.println(ft.getFlightNumber()+ " "+ft.getDeparture()+ " "+ft.getArrival()+ " "+ft.getDate());
	    } 
	}
}


