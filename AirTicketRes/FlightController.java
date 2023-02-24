package AirTicketRes;

import java.util.ArrayList;

public class FlightController {
	static ArrayList<Flight> list = new ArrayList<>();

    FlightController() {
        list.add(new Flight("CD456", "bangalore", "mumbai", "2022-03-02",100));
        list.add(new Flight("EF457", "kerala", "chennai", "2022-03-06",50));
        list.add(new Flight("GH458", "dubai", "mumbai", "2022-03-09",70));
        list.add(new Flight("DR234", "bangalore", "chennai", "2022-03-07",50));
    }

    public void addFlight(Flight flight) {
        list.add(flight);
    }

    public void showFlights() {
        for (Flight ft : list) {
            System.out.println(ft.getFlightNumber() + " " + ft.getDeparture() + " " + ft.getArrival() + " "
                    + ft.getDate());
        }
    }

    public void bookSeat(String flightNumber, int seatNumber) {
        Flight flight = null;
        for (Flight f : list) {
            if (f.getFlightNumber().equals(flightNumber)) {
                flight = f;
               
               
                break;
            }
        }
       
        if (flight == null) {
            System.out.println("Invalid flight number");
            return;
        }
                ArrayList<BookingSeats> availableSeats = flight.getAvailableSeats();
        boolean seatBooked = false;
        for (BookingSeats seat : availableSeats) {
            if (seat.getSeatNumber() == seatNumber) {
                if (seat.isAvailable()) {
                    seat.setAvailable(false);
                    System.out.println("Seat " + seatNumber + " has been booked for flight " + flightNumber);
                } else {
                    System.out.println("Seat " + seatNumber + " is already booked for flight " + flightNumber);
                }
                seatBooked = true;
                break;
            }
        }
        if (!seatBooked) {
            System.out.println("Booked seat number for flight " + flightNumber);
        }
    }
}
