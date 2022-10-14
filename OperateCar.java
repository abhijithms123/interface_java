
package com.bytestrone.batch2.oops.interfaces;



//how the software interacts
//each group should be able to write their code without any knowledge of how the other group's code is written.

//interface can  contain only constants,method signatures,default methods,static methods and nested types.
//method body only exist for default methods and static methods

public interface OperateCar {
	// constant declarations, if any

// method signatures

	// an enum with values RIGHT, LEFT

	int turn(String direction, double radius, double startSpeed, double endSpeed);

	int changeLanes(String direction, double startSpeed, double endSpeed);

	int signalTurn(String direction, boolean signalOn);

	int getRadarFront(double distanceToCar, double speedOfCar);

	int getRadarRear(double distanceToCar, double speedOfCar);
	// .....
	// more method signatures
}