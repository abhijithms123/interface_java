package com.bytestrone.batch2.oops.interfaces;

public class operateBMW760i implements OperateCar {

	@Override
	public int turn(String direction, double radius, double startSpeed, double endSpeed) {
		// code to turn the bmw
		return 0;
	}

	@Override
	public int changeLanes(String direction, double startSpeed, double endSpeed) {
		// code to change the lane
		return 0;
	}

	@Override
	public int signalTurn(String direction, boolean signalOn) {
		// code to turn BMW's LEFT turn indicator lights on.
		// code to turn BMW's LEFT turn indicator lights off.
		// code to turn BMW's RIGHT turn indicator lights on.
		// code to turn BMW's RIGHT turn indicator lights off.
		
		return 0;
	}

	@Override
	public int getRadarFront(double distanceToCar, double speedOfCar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRadarRear(double distanceToCar, double speedOfCar) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//other members, as needed -- for example, helper classes not
	// visible to clients of the interface.

}


/* in the robotic example above,it is the automobile manufacturers who will implement the interface.chevorlet's
 * implementation will be substantially different from that of Toyota,of course,but both manufacturers
 * will adhere to the same interface.*/



