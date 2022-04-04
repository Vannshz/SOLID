package com.solid.violation;


interface TravelBooking {
	public void bookTicket();
	public void bookRentalCar();
	public void bookRentalBike();

}
class TicketBookingByAgent implements TravelBooking {

	@Override
	public void bookTicket() {
		trainTicket();
	}

	@Override
	public void bookRentalCar() {

	}

	@Override
	public void bookRentalBike() {

	}

	public void trainTicket()
	{
		System.out.println("Train Ticket Booked Successfully");
	}

}
class TrainTicket extends TicketBookingByAgent {
	@Override
	public void bookTicket() {
		System.out.println("Train Ticket Booked Successfully");
	}
}
public class SolidTest {
	TicketBookingByAgent t=new TrainTicket();

}
