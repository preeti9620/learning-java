package com.test.opps;

public class Bike extends Bicyle {
	int seatHi;
	public Bike(int gear,int speed, int startSeat){
		super(gear,speed);
		seatHi = startSeat;
	}
	public void setHeight(int newValue){
		seatHi= newValue;
		
	}
	public String tostring(){
		return (super.toString() + " >>> seat >>>> " + seatHi);
	}

}
