package com.bytestrone.batch2.oops.interfaces;

import java.awt.Point;

public class RectanglePlus implements Relatable {
	public int width;
	public int height;
	public Point origin;

	// four constructors
	public RectanglePlus(Point p) {
		origin = p;
	}

	public RectanglePlus(int w, int h) {
		origin = new Point(0, 0);
		width = w;
		height = h;
	}

	public RectanglePlus(Point p, int w, int h) {
		origin = p;
		width = w;
		height = h;
	}

	// a method for moving the rectangle
	public void move(int x, int y) {
		origin.x = x;
		origin.y = y;
	}
	// a method for computing
	// the area of the rectangle

	public int getArea() {
		return width * height;
	}

	// a method required to implement
	// the relatable interface

	public int isLargerThan(Relatable other) {
		// below is typecasting a reference variable
		// And casting a reference variable doesn’t touch the object it refers to but
		// only labels this object in another way, expanding or narrowing opportunities
		// to work with it. Upcasting narrows the list of methods and properties
		// available to this object, and downcasting can extend it.
		RectanglePlus otherRect = (RectanglePlus) other;
		if (this.getArea() < otherRect.getArea()) {
			return -1;
		} else if (this.getArea() > otherRect.getArea()) {
			return 1;
		} else {
			return 0;
		}
	}

}
