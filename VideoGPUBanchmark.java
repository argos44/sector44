/*this program test the speed of the graphics card */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.lang.Math.*;

VideoGPUBanchmark extends GCanvas 
 {
	
        /**
    *
    */
    
    private static final long serialVersionUID = 1L; //

    public int randomPolySideLength() /*the side of the polygon dra(w)n succesively is generated in a random (pseudorandom) way */
        {
         /* Would use Math.random, because the alternative is dependant on the CPU too*/

         /*so, it would not cleanly...... measure the speed of the graphics card. RAMDAC, etc, is another story */
         
         double side = Math.random();
    
        }

    /*public void setColor(Color.MAGENTA);  */ 

    /*4b8b8b 4b8b8b*/
    /*4b8b8b 4b8b8b*/

    /*inverse sink*/

 /*randomPolySideLength.side, and this (which I never understood, it IS confusing, is not necessary (probably), 'cause they are global variables, or the equivalent')*/
    
    public void run() {

        for (int i = 0; i < 5000; i++) 
            {
                private GPolygon createHexagon(final double side)
                 {
                    final GPolygon hex = new GPolygon();
                    hex.addVertex(-side, 0);
                    for (int z = 0; z < 5; z++) 
                     {
                      hex.addPolarEdge(side, 60 - z * 60);
                     }
                    return hex;
                 }
            }    
         
 
        
