/* MAKE SURE YOU UPDATE THESE COMMENTS WITH YOUR OWN INFORMATION
 * (And then remove this top instructional comment)
 * File Name: DrawMyName.java
 * Created by:  Shari Haynes, cs8a3 and Aditya Avinash, cs8a4
 * Due Date:    October 2, 2013
 *
 * Partner Histories:
   * Shari Haynes:
      PSA1 Partner:  Aditya Avinash, cs8a4
      PSA2 Partner:  To be determined...
      PSA3 Partner:  To be determined...
      PSA4 Partner:  To be determined...
      PSA5 Partner:  To be determined...
      PSA6 Partner:  To be determined...
      PSA7 Partner:  To be determined...
      PSA8 Partner:  To be determined...
      PSA9 Partner:  To be determined...

   * Aditya Avinash:
      PSA1 Partner:  Shari Haynes, cs8a3
      PSA2 Partner:  To be determined...
      PSA3 Partner:  To be determined...
      PSA4 Partner:  To be determined...
      PSA5 Partner:  To be determined...
      PSA6 Partner:  To be determined...
      PSA7 Partner:  To be determined...
      PSA8 Partner:  To be determined...
      PSA9 Partner:  To be determined...
 */

public class DrawMyName
{
    // The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args)
    {
      // This is some starter code, but it has errors.  You will 
      // fix these errors and then add your code to draw your name
      // here.  Be sure to remove this comment once you've fixed the 
      // errors and started adding your own code.
      World w = new World();
      Turtle jose = new Turtle(200,100,w); //Creates a turtle in w at (x,y) (200,100)     

      //Make a U shape 
      jose.forward(55);
      jose.turn(90)
      jose.forward(30);
      jose.turnRight(90);
      jose.forward(45);
      jose.forward(10);
      jose.turn(90);
      
    }
}