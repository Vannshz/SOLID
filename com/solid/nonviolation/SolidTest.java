package com.solid.nonviolation;

public class SolidTest {
	public static void main(String[] args) {
		BookingByAgent agent=new BookingByAgent(new FlightTicket());
		agent.bookTicket();
		Vehicle vehicle=new Vehicle();
		vehicle.bookRentalBike();

	}
}
