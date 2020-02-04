package com.java.training.localinnerclass;

public class LocalInnerClass {

	public static void main(String[] args) {
		// invoke outer class method
				BusStation busStation = new BusStation();
				System.out.println();
				busStation.busStationtimeCal();
	


	}

}

class BusStation

{

	public void busStationtimeCal() {

		System.out.println("Invoke BusStation timeCal() method");

		// inner class
		class Bus {
			public void busRun() {
				System.out.println("Invoke Bus run() method ");

			}

		}
		// inner class -instantiating
		Bus bus = new Bus();
		bus.busRun();
	}


}
