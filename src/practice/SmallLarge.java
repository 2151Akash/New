package practice;
import java.util.*;
public class SmallLarge {



	// Recursive function to find the largest element
	static int maximum(int array[], int index, int len)
	{
	int max;

	if(index >= len-2)
	return (array[index] > array[index + 1]) ? array[index] : array[index + 1];

	max = maximum(array, index + 1, len);

	return (array[index] > max) ? array[index] : max;
	}


	//Recursive function to find the smallest element
	static int minimum(int array[], int index, int len)
	{
	int min;

	if(index >= len-2)
	{
	return (array[index] < array[index + 1]) ? array[index] : array[index + 1];
	}

	min = minimum(array, index + 1, len);

	return (array[index] < min) ? array[index] : min;
	}

	public static void main(String args[])
	{
	int array[] = new int[]{5, 2, 7, 8, -2,25,25};
	int max, min;
	int N = 5;
	max = maximum(array, 0, N);
	min = minimum(array, 0, N);

	System.out.print( max );
	System.out.print(min );
	}
	}

