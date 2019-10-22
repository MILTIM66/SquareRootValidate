/*
Name: square root
Purpose: get the square root of a number inputed.
Date: 2019-11-10
Author: Tanner Kennedy
*/

import java.io.*;

public class SquareRoot
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader keyboardInput = new BufferedReader (new InputStreamReader (System.in));

	System.err.print ("Please enter a number you would like to square root ");
	double number = Double.parseDouble (keyboardInput.readLine ());
	if (number <= 0)

	    {
		System.out.println (" UNDEFINED");
	    }

	else
	{
	    double squareRoot = Math.sqrt (number);
	    //Displaying the number and square root
	    System.out.println ("number : " + number);
	    System.out.println (squareRoot);
	}

    }
}
