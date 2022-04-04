package com.solid.violation;


interface Vehicle{
	public void rentalBike();
	public void rentalCars();
}
class Flight{
	public void flight1() {
		System.out.println(" Flight1 Ticket Booked Sucessfully");
	}
	public void flight2(){
		System.out.println(" Flight2 Ticket Booked Sucessfully");
	}
}

class TicketBooking1 extends Flight{
	@Override
	public void flight1() {
		System.out.println(" Flight1 Ticket Booked Sucessfully");
	}
	public void train(){
		System.out.println(" train Ticket Booked Sucessfully");
	}

}
class VehicleBooking implements Vehicle{

	@Override
	public void rentalBike() {
		System.out.println("bike booked");
	}

	@Override
	public void rentalCars() {
		System.out.println("car booked");
	}
}

public class SolidTest {
	public static void main(String[] args) {
		TicketBooking1 tb=new TicketBooking1();

		tb.flight1();
		tb.train();
	}

}