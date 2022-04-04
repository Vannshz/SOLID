package com.solid.nonviolation;

public class TrainTicket implements TravelBooking {
	@Override
	public void bookTicket() {
		System.out.println("Train Ticket Booked Successfully");
	}
}
