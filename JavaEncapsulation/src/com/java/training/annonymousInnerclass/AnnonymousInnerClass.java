package com.java.training.annonymousInnerclass;

public class AnnonymousInnerClass {

	public static void main(String[] args) {
		AnonymousBusStation anonymousBusStation = new AnonymousBusStation() {

			public void parking() {
				System.out.println("Invoke AnonymousBusStation parking()method");
			}

		};

		anonymousBusStation.parking();
	}

}

interface AnonymousBusStation {
	public void parking();
}