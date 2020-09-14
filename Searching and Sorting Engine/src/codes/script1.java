package codes;

import java.util.Scanner;


public class script1 {

	
//public array of size 100 to use in all methods	
	public static int SIZE = 100;
	static int[] numbers = new int[SIZE];

//------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------instantiate new random array		
	public static void createRNDArray()
	{
		for(int x = 0; x < SIZE; x++)
		{   //set the array as the random number
		    int randomNum = (int) ((Math.random() * SIZE) + 1);
			numbers[x] = randomNum;
		}
	}
//------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------list array from 1 to 100	
	public static void sequentialArray()
	{//run for loop 100 times and increase the number in each index by 1
		for(int x = 0; x < SIZE; x++)
		{
			numbers[x] = x + 1; 
		}

	}
//----------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------print the array  
	public static void printArray()
	{
		System.out.println();
		// print so that the array looks like a square 10x10
		for(int x = 0; x < SIZE; x++)
		{
		  System.out.print(numbers[x] + "\t");
		    if(x % 10 == 9)
		  {
			System.out.println();
		  }
		
		}
        
		System.out.println();
   }
//------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------change order of array	
	public static void shuffleArray()
	{
        //loop 100 times   	 
	  	for(int x = 0; x < SIZE; x++)
		{ 
        //random number for array
	  	int randomShuffle = (int) (Math.random() * SIZE);
        
	  	//store original array as temporary
		int temp = numbers[x];
        //set original array to random array 
		numbers[x] = numbers[randomShuffle];
        //set random array to the older array	  	
		numbers[randomShuffle] = temp;
		}
	 
	}
//-----------------------------------------------------------------------------------------
//------------------------------------------------------find location of number in the array	
	public static void findArray()
	{
		Scanner input = new Scanner(System.in);
		  
		  //place is the index number
		  int place = 0;
          int number;
          
          //this is outside for loop because the last if statement uses this variable
          int x = 0;
          
          //take input for the number that needs to found      
          System.out.print("Enter Number: ");
          number = input.nextInt();
          System.out.println();
          
          //boolean to see if number is found
          boolean numberFound = false;
          
          //run for loop until the entire array is checked
          for(x = 0; x < SIZE; x++)
		{

        //once the the number is found the place of the number is set to the x value and the place is printed
          if(numbers[x] == number)
		  {	 
		 	 place = x;	 
		    //print index 
		 	 System.out.println("Your number is in index: " + place);
             System.out.println();        
             numberFound = true;
             break;
		  }
            
          
		}
          //if the number is not found then print -1
	      if(numberFound == false)
          {
        	  System.out.println("-1");
        	  System.out.println();
          
          }
         
          
 		
	}
//---------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------	
	public static boolean ascendingArray()
	{
		
		for(int x = 0; x < SIZE - 1; x++)
		
		{
			if(numbers[x] > numbers[x + 1])
			{
				return false;//numbers not in ascending order	
			}
		}
		
	return true;//numbers are in ascending order  		
	}
//---------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------	
	public static void ascendingShuffle()
	{
	    int counter = 0;// shuffle counter
	    // ascendingArray();
	    while (ascendingArray() == false || counter < 100000 )// run shuffle method until the numbers are in ascending order or the counter reaches 100000 
		{
			shuffleArray();
	    	counter++;
		}
		
	}
//---------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------
	public static void lowestNumber()
	{
		//set lowest number to be the first number in the array
		int lowestNum = numbers[0];
		for(int x = 0; x < SIZE; x++)
		{
			//if any of the numbers in the array are lower than the lowestNum then set lowestNum to that number
			if(numbers[x] < lowestNum)
			{
				lowestNum = numbers[x];	
			}
			
		}
		//print lowest number
		System.out.println("The lowest number in the array is: " + lowestNum + "\n");
	}
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------	
	public static void highestNumber()
	{
		//set highest number to be the first number in the array
		int highestNum = numbers[0];
		for(int x = 0; x < SIZE; x++)
		{
			//if any of the numbers in the array are higher than the highestNum then set lowestNum to that number
			if(numbers[x] > highestNum)
			{
				highestNum = numbers[x];	
			}
			
		}
		//print highest number
		System.out.println("The highest number in the array is: " + highestNum + "\n");
	}
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
	public static void occurrenceAmount()
	{
		
		
		Scanner input = new Scanner(System.in);
        int number;
        int occurrence = 0;
        //take input for the number that needs to found      
        System.out.print("Enter Number: ");
        number = input.nextInt();
        System.out.println();
        
        //run for loop until the entire array is checked
        for(int x = 0; x < SIZE; x++)
		{

      //once the the number is found the occurrence counter increases
        if(numbers[x] == number)
		 {	 
        	occurrence ++;    
		 }
		
		}
	      //print number of times the number repeats
        System.out.println("Your number occures " + occurrence + " times.\n" );
 	
	}
//-----------------------------------------------------------------------------------------------	
//-----------------------------------------------------------------------------------------------	
	public static void switchNumbers()
	{
		Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        //int occurrence1 = 0;
        //int occurrence2 = 0;
        //take input for the numbers that need to be switched      
        System.out.print("Enter your first Number: ");
        number1 = input.nextInt();
        System.out.println();
        System.out.print("Enter your second Number: ");
        number2 = input.nextInt();
        System.out.println();
		
        for(int x = 0; x < SIZE; x++)
		{
        	//if the number in the array equals the first number that the user inputs then set that number to the second number that the user inputs
        	if(numbers[x] == number1)
   		 {	 
        		numbers[x] = number2;
   		 }
		}
		
		
	}
//------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------
	public static void largestContSum()
	{   //initialize sum variable
		//Find the sum of the first ten indexes 
		int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3]	+ numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8] + numbers[9];
		
		for(int x = 0; x < SIZE - 10; x++)
		{ //find sum of the next consecutive ten numbers if the sum is greater than the sum of the first ten consecutive numbers
		  if(numbers[x + 1] + numbers[x + 2] + numbers[x + 3]	+ numbers[x + 4] + numbers[x + 5] + numbers[x + 6] + numbers[x + 7] + numbers[x + 8] + numbers[x + 9] + numbers[x + 10] > sum)
		   {
		   
			sum = numbers[x + 1] + numbers[x + 2] + numbers[x + 3]	+ numbers[x + 4] + numbers[x + 5] + numbers[x + 6] + numbers[x + 7] + numbers[x + 8] + numbers[x + 9] + numbers[x + 10];
		   }		
        }
		//print sum
		System.out.println("The largest sum of ten consectutive numbers is: " + sum + "\n");
		
	}
//------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------
	public static void bubbleSort()
	{
		int temp;
		
		for(int x = 0; x < SIZE; x++)
		{    
			for(int y = 0; y < x + 1; y++) 
		    {
		    	//check 2 numbers
		        if(numbers[y] > numbers[x]) //if the 2nd number in the set is greater than the first number then switch them  
		        {
		        	//switch numbers code
		            temp = numbers[y];
		            numbers[y] = numbers[x];
		            numbers[x] = temp;
		        }
		    }
		}
		
		
	}
//------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------    
	public static void binarySearch()
    {
	  Scanner input = new Scanner(System.in);
		
	  int min = numbers[0];
	  int max = numbers[SIZE - 1];
	  
	  int center = 0;
	  int index = 0;
	  
	  //input number
	  System.out.print("Enter Number: ");
	  int number = input.nextInt();
	  
	  //loop until the number is not equal to the number at the center 
	  while(numbers[center] != number)
	  {
		 //average of min and max
		 center = (min + max)/2; 
		 
		 //if the number is greater than center then reset the min to be 1 more than the center 
		 if(numbers[center] < number)
		 {
			 min = center + 1;
		     
		 }
		 //if the number is greater than center then reset the max to be 1 less than the center 
		 else if(numbers[center] > number)
		 {
			 max = center - 1;
		 }
		 //otherwise the only other possibility is that the center number is equal the inputed number
		 else
		 {
		    index = center;
		 }
	  }
      
	  //print the index of the number
	  System.out.println("Your Number is in Index: " + index);
	  System.out.println();
    
    }
//--------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------
	public static void insertionSort()
    { 
		    //x is counter that goes to 100
	        for (int x = 1; x < SIZE; x++) 
	        { 
	            //set the number behind x as the value to be inserted
	            int insertValue = x - 1; 
	 
	            int insertPlace = numbers[x];
	            
	            while (insertValue >= 0 && numbers[insertValue] > insertPlace) 
	            { 
	            	//set the value of the number at insetValue to the next index 
	            	numbers[insertValue+1] = numbers[insertValue]; 
	            	//check all numbers below the insertValue index until the counter reaches 0 
	            	insertValue--; 
	            }
	            
	            numbers[insertValue + 1] = insertPlace; 
	        }		
    }
	
//--------------------------------------------------------------------------------------------	
//--------------------------------------------------------------------------------------------  
	public static void selectionSort()
    {
		int min; 
		
	    for (int x = 0; x < SIZE-1; x++) 
	    { 
	        // set the min value of the array as x
	    	min = x; 
	        
	    	for (int y = x+1; y < SIZE; y++) 
	    	{
	    	    //if the number at index y is less than the number at index min then set the min number to be y	
	    		if (numbers[y] < numbers[min]) 
	    		{
	             min = y;
	    		}
	    	}
	        
	    	//switch the number at index x with the number at index min
	    	int temp = numbers[min]; 
            numbers[min] = numbers[x]; 
            numbers[x] = temp; 
	    }

    }
	
//--------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------
	public static void quickSort(int[] quickNumbers, int start, int end) 
	{ 
		
		       //create variables
			   int leftSlider;
			   int rightSlider;
			   int pivot;
			  
               //if the end index is greater than start then set pivot and rightSlider to the start and left slider to the end
			   if(start < end){
			      
				  pivot = start;
			      leftSlider = start;
			      rightSlider = end;
			    
			      //loop until the number to the left of pivot is less than number at pivot 
			      while(leftSlider < rightSlider){

					  //loop until the number to the left of pivot is less than number at pivot 
			    	  while(quickNumbers[leftSlider] <= quickNumbers[pivot] && leftSlider < end)
			    	  {
			        	 leftSlider++;
			    	  }
			    	 
			    	  //loop until the number to the right of pivot is greater than number at pivot 
			    	  while(quickNumbers[rightSlider] > quickNumbers[pivot])
			    	  {
			        	 rightSlider--;
			    	  }
			         
			    	//switch the place of the numbers if the right slider location is greater than of equal left slider location
			    	  if(leftSlider < rightSlider){
			    		int temp = quickNumbers[leftSlider];
			            quickNumbers[leftSlider] = quickNumbers[rightSlider];
			            quickNumbers[rightSlider] = temp;
			         }
			      }

			      //switch pivot number with the right slider number 
			      int temp = quickNumbers[pivot];
			      quickNumbers[pivot] = quickNumbers[rightSlider];
			      quickNumbers[rightSlider] = temp;
			      
			      //recursively call quickSort method to solve each part of the array
			      quickSort(quickNumbers, start, rightSlider-1);
			      quickSort(quickNumbers, rightSlider+1, end);

			   }
			}
//--------------------------------------------------------------------------------------------	
//--------------------------------------------------------------------------------------------------------------------- 
        

		// A function to do counting sort of arr[] according to 
		// the digit represented by exp. 
		public static void digitSorter(int radixNumbers[], int power) 
		{ 
			int output[] = new int[SIZE]; // output array 
			 
			int digitFrequency[] = new int[10];

			int digit = 0;
			
			// Store count of occurrences in count[] 
			for (int x = 0; x < SIZE; x++) 
			{
				digit = (radixNumbers[x]/power) % 10;
				digitFrequency[digit]++;   
			}

			//add the previous digit frequency
			for (int x = 1; x < 10; x++) 
			{
				digitFrequency[x] += digitFrequency[x - 1]; 
			}
			
			//sort the numbers according to their frequency
			for (int x = SIZE - 1; x >= 0; x--) 
			{
				digit = (radixNumbers[x]/power) % 10;
				int frequency =  digitFrequency[digit] - 1;
				output[frequency] = radixNumbers[x]; 
				digitFrequency[digit]--;
			} 

			//copy to the original array
			for (int x = 0; x < SIZE; x++) 
			{
				radixNumbers[x] = output[x]; 
			}
		} 
 
	
		public static void radixSort(int radixNumbers[]) 
		{ 
			//get max number in the unsorted array
			int max = radixNumbers[0]; 
			for (int x = 1; x < SIZE; x++)
			{
				//if the number after the number at index 0 is greater, then set it to max
				if (radixNumbers[x] > max) 
				{
					max = radixNumbers[x];
				}
			}
            
			//for loop to keep executing the method digitSorter method until the last number (max) has been sorted
			for (int power = 1; max/power > 0; power *= 10)
			{
				digitSorter(radixNumbers, power); 
			}
		} 

		
		
		public static int digitFinder(int number, int digitPlace)
		{
			int digit = (int) (number%Math.pow(10, digitPlace) - number%Math.pow(10, digitPlace -1));
			
					digit = (int) (digit/Math.pow(10, digitPlace));
			return digit;	
		}
		
		
		/*public static void radixSORTY()
		{
			boolean isSorted = ascendingArray();
			
			int digitPlace = 0;
		
			
			
			
			while(isSorted != true)
			{	int [] copy = new int [SIZE];
				int i = SIZE - 1;
				
				for(int digits = 9; digits >= 0; digits--)
				{
					
					for(int n = SIZE - 1; n >= 0; n--)
					{
						if(digits == digitFinder(numbers[n], digitPlace))
						{
						  copy[i] = numbers[n];
						}
					i--;
					}
									}
				
				digitPlace++;

				for(int x = SIZE - 1; x >= 0;x--)
				{
					numbers[x] = copy[i];
					
				}
			}
			
		}*/
		
	
//--------------------------------------------------------------------------------------------	
//----------------------------------------------------------------------------------------------------------------------	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		
        int selection;
		
		do{
//-------------------------------------------------------prompts
			System.out.println("0. Exit the program");
        	System.out.println("1. Populate array randomly");
        	System.out.println("2. Populate the array sequentially from 1 to 100");
        	System.out.println("3. Display the array");
			System.out.println("4. Shuffle the array");
			System.out.println("5. Find the index of a number in the array");
			System.out.println("6. Check to see if array is in ascending order");
			System.out.println("7. Coninuously shuffle until the array is in ascending order");
			System.out.println("8. Find lowest number in the array");
			System.out.println("9. Find highest number in the array");
			System.out.println("10. Find how many times a number occures in the array");
			System.out.println("11. Replace the first number with the second number");
			System.out.println("12. Find largest sum of ten consecutive numbers");
			System.out.println("13. Bubble sort in ascending order");
            System.out.println("14. Find the index of a number in an array using binary search");
            System.out.println("15. Insertion sort in ascending order");
            System.out.println("16. Selection sort in ascending order");
            System.out.println("17. Quick sort in ascending order");
            System.out.println("18. Radix sort in ascending order");
//-----------------------------------------------------input       	
			System.out.print("\nMake a Selection: ");
			selection = input.nextInt();
			System.out.println();
//----------------------------------------------------------execute if and methods statements depending on the selection			
			if(selection == 1)
		{
			    createRNDArray();	
		}
			
			if(selection == 2)
		{
			    sequentialArray();
		}
				
			if(selection == 3)
		{
				printArray();
		}	
			
			if(selection == 4)
		{
				shuffleArray();
		}	
			
		    if(selection == 5)
		{
		    	findArray();    	
		}
		    
		    if(selection == 6)
		{
		      ascendingArray();    	
		    
			  if(ascendingArray() == true)
		      {
		    	  System.out.println("Array is in ascending order.\n");
		      }
		      if(ascendingArray() == false)
		      {
		    	  System.out.println("Array is not in ascending order.\n"); 
		      }
		}
		    if(selection == 7)
		{
		        ascendingShuffle();
	    }
		    if(selection == 8)
		{
		    	lowestNumber();
	    }
		    
		    if(selection == 9)
		{
			    highestNumber();
		}
		{
		    if(selection == 10)
		    	occurrenceAmount();
	    }
		    if(selection == 11)
	    {
			    switchNumbers();
		}
		    if(selection == 12)
		{
		    	largestContSum();	
	    }
		    if(selection == 13)
		{
		    	bubbleSort();
	    }
		    if(selection == 14)
		{
			    binarySearch();
		}
		    if(selection == 15)
		{
			    insertionSort();
		}
		    if(selection == 16)
		{
	            selectionSort();	    	
	    }
		    if(selection == 17)
		{
		        quickSort(numbers, 0, SIZE - 1);	    	
		}
	        if(selection == 18)
	    {
	            radixSort(numbers);        	
	    }
		    
	}while(selection != 0);//loop until selection is 0 

		
	}
//---------------------------------------------------------------------------------------------------------------------

  }

