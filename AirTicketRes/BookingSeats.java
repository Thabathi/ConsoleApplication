package AirTicketRes;

public class BookingSeats {
    private Seat[] seats;

    public BookingSeats(int numSeats, String string, boolean b) {
        this.seats = new Seat[numSeats];
        for (int i = 0; i < numSeats; i++) {
            seats[i] = new Seat(i + 1, "Economy", true);
        }
    }
    BookingSeats()
    {
    	
    }
    public class Seat {
        private String seatClass;
        private boolean available;
        private int seatNumber;

        public Seat(int seatNumber, String seatClass, boolean available) {
            this.seatNumber = seatNumber;
            this.seatClass = seatClass;
            this.available = available;
        }

        public int getSeatNumber() {
            return seatNumber;
        }

        public String getSeatClass() {
            return seatClass;
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }
    }



    public boolean bookSeat(int seatNumber) {
        if (seatNumber <= 0 || seatNumber >seats.length ) {
            System.out.println("Booked Successfully Thaank you for booking");
            return false;
        }

        Seat seat = seats[seatNumber - 1];
        if (!seat.isAvailable()) {
            System.out.println("Seat " + seatNumber + " is already booked");
            return false;
        }

        seat.setAvailable(false);
        System.out.println("Seat " + seatNumber + " has been booked");
        return true;
    }

	public int getSeatNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setAvailable(boolean b) {
	  

	}
}
