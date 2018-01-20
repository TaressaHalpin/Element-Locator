
/*
 CIS 209: INTRO TO JAVA 
 WEEK 10 HOMEWORK 
 
 PROBLEM:  
 LOCATE LARGEST ELEMENT
 RETURN VALUE IS A 1D ARRAY CONTAINING 2 ELEMENTS
 2 ELEMENTS INDICATE ROW AND COLUMN FROM LARGEST ELEMENT IN 2D ARRAY
 TEST PROGRAM: PROMPTS USER TO ENTER A 2D ARRAY AND DISPLAY LOCATION
 OF LARGEST ELEMENT IN ARRAY. 
  
  */
//IMPORT SCANNER
import java.util.Scanner;

//LOCATE ELEMENT CLASS
public class locateelement {

	//MAIN METHOD
	public static void main(String[] args)
	{
		//INPUT SCANNER SYSTEM
		Scanner input = new Scanner(System.in);
		//PRINTS OUT USER PROMPT
		System.out.printf("Enter Number of Rows and Columns of 2D Array: ");
		//DECLARE INT ROWS
		int rows = input.nextInt(); 
		//DECLARE INT COLUMNS
		int columns = input.nextInt();
		//DECLARE 2D DOUBLE ARRAY
		double[][] m = new double[rows][columns];
		//PRINTS OUT ENTER ARRAY
		System.out.println("Enter array: ");
		//FOR LOOP: ROW I
		for(int i = 0; i < rows; i++)
			//FOR LOOP: ROW K
			for(int k = 0; k < columns; k++)
				m[i][k] = input.nextDouble();
		
		//INT ARRAY LOCATE LARGEST ELEMENT		
		int[] elementLocation = locateLargest(m); 
		//FORMATED STRING, ARRAY ROWS AND COLUMNS FOR LARGEST ELEMENT LOCATION
		System.out.printf("Location of Largest Element is at (%d, %d)\n", elementLocation[0], elementLocation[1]);
				
	}
	//STATIC INT ARRAY LOCATE LARGEST ELEMENT IN 2D ARRAY
	public static int[] locateLargest(double[][] a)
	{
		//INT ARRAY LOCATE LARGEST NEW INT ARRAY
		int[] locateLargest = new int[] {0,0};
		//DOUBLE VARIABLE LARGEST ELEMENT
		double largestElement = a[0][0];
		//FOR LOOP I SET TO 0
		for(int i = 0; i < a.length; i++)
		{
			//FOR LOOP K SET TO 0
			for(int k = 0; k < a[i].length; k++)
			{
				//IF STATEMENT I/K GREATER THAN LARGEST ELEMENT
				if(a[i][k]>largestElement)
				{
					//LOCATE LARGEST ROW ELEMENT
					locateLargest[0] = i; 
					//LOCATE LARGEST COLUMN ELEMENT
					locateLargest[1] = k;
					//LARGEST ELEMENT 
					largestElement = a[i][k];
				}
			}
		}
		    //RETURN LARGEST ELEMENT LOCATION 
			return locateLargest; 	
	}
		
}
