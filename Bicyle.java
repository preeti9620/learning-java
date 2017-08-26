package com.test.opps;

public class Bicyle {
	int gear;
	int speed;
	
	public Bicyle(int gear , int speed){
		this.gear=gear;
		this.speed= speed;
		
	}
	public void applyBreak(int decrement){
		
		 speed -= decrement;
	}
	public void speedUp(int increment){
		 speed += increment;
	}
	
	public String toString(){
		 return("no og gear >>> " + gear + " no of speed  >>> " +speed);
	}
	

}
