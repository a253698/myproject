package com.mavis.ticket;

public class TwoWayTicket extends OneWayTicket{
	
	String returnTime;
	String returnDate;

	public TwoWayTicket(String date, String time, String startStation, String lastStation, int price, String returnTime, String returnDate) {
		super(date, time, startStation, lastStation, price);
		this.returnTime = returnTime;
		this.returnDate = returnDate;
	}
	

	float discount = 0.85f;
	
	public void print(){
		System.out.println(date + "\t" + time + "\t" + startStation + "\t" + lastStation + "\t" + (int)((price)*(2)*(discount))  + "\t" + returnTime + "\t" + returnDate);
	}

}
