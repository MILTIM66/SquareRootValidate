/*
Name: square root validate
Purpose: get the square root of a number inputed.
Date: 2019-22-10
Author: Tanner Kennedy
*/

import java.io.*;

public class SquareRootValidate
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader keyboardInput = new BufferedReader (new InputStreamReader (System.in));

	System.err.print ("Enter a number: ");
	double number = Double.parseDouble (keyboardInput.readLine ());
	
	while (number <= 0)
	    {
		System.out.println ("You must enter a non-negative number!");
	    }
	if number > 0
	    {
		double squareRoot = Math.sqrt (number)
	    	System.out.println (squareRoot);
	    }

    }
}
