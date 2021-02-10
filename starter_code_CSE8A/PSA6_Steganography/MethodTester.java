/*
 * This class should be used to test all the new methods you have written in Picture.java class
 * You can run the existing tests and add new tests to test your methods.
 */

import java.io.*;

public class MethodTester
{
  public static void main (String[] args) throws IOException
  {
    // This is a "dummy Picture" that we use just to call methods
    Picture pic = new Picture();
    
    // **** Test cases for method embedDigits2 *******
    int result = pic.embedDigits2(182,2);
    System.out.println( "The result of pic.embedDigits2(182,2) is " + result );
    if ( result == 182 ) {
      System.out.println( "This is correct!" );
    }
    else {
      System.out.println( "This is WRONG!  Should be 182" );
    }
    // Add a similar test case to test this method for embedding 1 in 13;
    
    
    // **** Test cases for method embedDigitsN *******
    result = pic.embedDigitsN(31,0,4);
    System.out.println( "The result of pic.embedDigitsN(31,0,4) is " + result );
    if ( result == 16 ) {
      System.out.println( "This is correct!" );
    }
    else {
      System.out.println( "This is WRONG!  Should be 16" );
    }
    
    // Add a test case to test embedDigitsN method when method arguments  are contextVal= 64,  messageVal=2 and N=5
    
    
     // **** Test cases for method getLeastSignificant2 *******
    result = pic.getLeastSignificant2(255);
    System.out.println( "The result of pic.getLeastSignificant2(255) is " + result );
    if ( result == 3 ) {
      System.out.println( "This is correct!" );
    }
    else {
      System.out.println( "This is WRONG!  Should be 3" );
    } 
    // Add a test case to test getLeastSignificant2 method when method arguments  63
    
    
     // **** Test cases for method getLeastSignificantN *******
    result = pic.getLeastSignificantN(15,3);
    System.out.println( "The result of pic.getLeastSignificantN(15,3) is " + result );
    if ( result == 7 ) {
      System.out.println( "This is correct!" );
    }
    else {
      System.out.println( "This is WRONG!  Should be 7" );
    }
    // Add a test case to test getLeastSignificantN method when method arguments  num= 28, N = 4
  }
}

