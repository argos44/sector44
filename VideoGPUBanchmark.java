/*program tests the speed of the various generations of graphics cards, because it ignores hardware acceleration */

/*
 * File: gfxtest.java
 * --------------------


 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class gfxtest extends GraphicsProgram {

	public static final double PHI = 1.666013;
	
	public void run() {
	   for (i = 1 : i=i+1 : i<360 ) {
		
		GCanvas FeltBored = new GCanvas(); 
	 GOval oval = new GOval(150, 50 + 50 / PHI, 100, 100 / PHI);
	  oval.setFilled(true);
	  
	  FeltBored.add(oval);
	  
	   Iterator iterationTerra = FeltBored.iterator();
	   }
	}

/* Standard Java entry point */
/* This method can be eliminated in most Java environments */
	public static void main(String[] args) {
		new gfxtest().start(args);
	}
}
