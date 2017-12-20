package com.Exercise2;



/**Match each situation in the first list with an item in the second list.

a. int[] A;

A[0] = 0;

b. The JVM starts running your program, but the JVM can&#39;t find the Java platform classes. (The

Java platform classes reside in classes.zip or rt.jar.)

c. A program is reading a stream and reaches the end of stream marker.

d. Before closing the stream and after reaching the end of stream marker, a program tries to

read the stream again.

__error

__checked exception

__compile error

__no exception**/

public class Matching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//a.3 (compile error). The array is not initialized and will not compile.
		//b.1 (error).
		//c.4 (no exception). When you read a stream, you expect there to be an end of stream marker. You should use exceptions to catch unexpected behavior in your program.
		//d.2 (checked exception).
	}

}
