package com.java.training.memberInnerclass;

public class MemberInnerClass {

	public static void main(String[] args) {
		BusStation busStation = new BusStation();
		
		// Instantiating inner class
		BusStation.Bus menberClassEx = busStation.new Bus();

		System.out.println(menberClassEx.getStationId());
	}

}

class BusStation

{
	// private variable - outer class
	private int stationId = 2;

	// inner class
	class Bus {
		// Accessing outer class private variable
		public int getStationId() {
			System.out.println("Member class vlaue");
			return stationId;
		}
	}
}