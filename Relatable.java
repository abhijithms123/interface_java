package com.bytestrone.batch2.oops.interfaces;

// interface that defines how to compare the size of objects.
public interface Relatable {
	//this (object calling isLargerThan)
	//and other must be instances of
	//the same class returns 1, 0 , -1
	//if this is greater than,
	// equal to,or less than other
	
	
	
	public int isLargerThan(Relatable other);
			
}

//Consider using the interface when our problem makes the statement “A is capable of [doing this]”.
//For example, “Clonable is capable of cloning an object”,
//“Drawable is capable of drawing a shape”, etc.