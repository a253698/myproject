package com.mavis.ticket;

public class OneWayTicket {

	String date;
	String time;
	String startStation;
	String lastStation;
	int price;
	
	public OneWayTicket(String date, String time, String startStation, String lastStation, int price){
		this.date = date;
		this.time = time;
		this.startStation = startStation;
		this.lastStation = lastStation;
		this.price = price;
	} 
	
	public void print(){
		System.out.println(date + "\t" + time + "\t" + startStation + "\t" + lastStation + "\t" + price);
	}
}
