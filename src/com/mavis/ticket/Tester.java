package com.mavis.ticket;

public class Tester {

	public static void main(String[] args) {
		OneWayTicket p1 = new OneWayTicket("2018-01-08", "18:30", "松山", "八賭", 65);
		p1.print();
		
		TwoWayTicket p2 = new TwoWayTicket("2018-01-08", "18:30", "松山", "八賭", 65, "2018-01-10", "20:45");
		p2.print();
	}

}
