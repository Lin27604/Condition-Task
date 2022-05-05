package LoopsTask;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
//		System.out.println("1. Get the range of numbers from user and sum. ");
//		int startNum;
//		int endNum;
//		int sum = 0;
//		System.out.println("Enter the start Number: ");
//		startNum = scanner.nextInt();
//		System.out.println("Enter the end Number: ");
//		endNum = scanner.nextInt();
//		if (startNum < endNum) {
//			for (int i = startNum; i <=endNum; i++) {
//				 sum += i;
//				
//			}
//			System.out.println("Result:" +sum);
//			
//		}

//		System.out.println("=========================================");
//		System.out.println("Reverse the given Number.");
//		int givenNum;
//		int reverse=0;
//		System.out.println("Enter the Number: ");
//		givenNum = scanner.nextInt();
//		while (givenNum > 0) {
//			reverse = reverse *10 + givenNum%10;
//			givenNum =givenNum/10;
//			
//		}
//		System.out.println(reverse);
//		
//		
//		System.out.println("=========================================");
//		System.out.println("Print the arithmetic table of given number.");
//		System.out.println("Enter the Number: ");
//		givenNum = scanner.nextInt();
//		for (int i = 1; i <=10; i++) {
//			System.out.println(givenNum +" * "+ i + " = "+ givenNum*i);
//			
//		}

//		System.out.println("=========================================");
//		System.out.println("Write a Java program to sort a numeric array.");
//		int count, temp;
//		System.out.print("Enter number of numbers you want in the array: ");
//        count = scanner.nextInt();
//        int[] array = new int[count];
//        
//        System.out.println("Enter array numbers:");
//        for (int i = 0; i < count; i++) {
//        	array[i]= scanner.nextInt(); 
//		}
//        for (int i = 0; i < array.length; i++) {
//        	for (int j = i+1; j < array.length; j++) {
//				
//        	if (array[i]>array[j] ) {
//        		temp = array[i];
//        		array[i] = array[j];
//        		array[j] =temp;
//        	}
//			}
//     
//        	
//		}
//       	for (int i = 0; i < array.length; i++) {
//    		System.out.print(array[i]);
//		
//	}

//    	System.out.println("========================================="); 
//    	System.out.println("5. Write a Java program to remove a specific element from an array.");
//		int arr, number;
//		System.out.print("Enter number of numbers you want in the array: ");
//        arr = scanner.nextInt();
//        int[] ls = new int[arr];
//        System.out.println("Enter array numbers:");
//        for (int i = 0; i < arr; i++) {
//        	ls[i]= scanner.nextInt(); 
//		}
//        System.out.println("Enter number to remove:");
//       number = scanner.nextInt();
//     
//        for (int i = 0; i < ls.length; i++) {
//        	if (ls[i] == number) {
//        	
//        		for (int j = i; j < ls.length-1; j++) {
//        			ls[j] =ls[j+1];
//        			
//				}
//        	
//			}
//			
//		}
//        for (int i = 0; i < ls.length-1; i++) {
//        	System.out.print(ls[i] +" ");
//			
//		}

//	 	System.out.println("========================================="); 
//     	System.out.println("6. Write a Java program to find the duplicate values of an array of integer values.");
//		int arr;
//     	System.out.print("Enter number of numbers you want in the array: ");
//        arr = scanner.nextInt();
//        int[] ls = new int[arr];
//        System.out.println("Enter array numbers:");
//        for (int i = 0; i < arr; i++) {
//      	ls[i]= scanner.nextInt(); 
//		}
//		for (int i = 0; i < ls.length-1; i++) {
//			for (int j = i+1; j < ls.length; j++) {
//				if((ls[i]==ls[j]) && (i!=j)) {
//					System.out.print(ls[j]);
//				}
//				else {
//					j++;
//				}
//				
//			}
//			
//		}

		// 7. Write a Java program to find the common elements between two arrays
		// (string values)
		System.out.println("=========================================");
		System.out.println("7. Write a Java program to find the common elements between two arrays (string values)");

		String[] array1 = { "cat", "dog", "bird", "fish" };

		String[] array2 = { "cat", "java", "lion" };

		System.out.println("Array1 : " + Arrays.toString(array1));
		System.out.println("Array2 : " + Arrays.toString(array2));

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i].equals(array2[j])) {
					set.add(array1[i]);
				}
			}
		}

		System.out.println("Common element : " + (set));

		// 8. Write a Java program to find the second largest element in an array

		System.out.println("=========================================");
		System.out.println("8. Write a Java program to find the second largest element in an array");
		int[] array = { 2, 1, 5, 9, 4, 12, 3, 45 };
		int temp;
		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(array[array.length - 2]);

		
		
		
		// 9. Find the given element from an Array.
		int[] arr = { 2, 1, 5, 9, 4, 12, 3, 45 };
		System.out.println("=========================================");
		System.out.println("9. Find the given element from an Array.");
		System.out.println("The number is at: "+ findIndex(arr,5));
		
		
		
		//10. Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
		System.out.println("=========================================");
		findSum(arr, 6);
		
		
		//11. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
		//Ask user for their salary and year of service and print the net bonus amount.
		System.out.println("=========================================");
		System.out.println("Enter your salary :");
		int salary = scanner.nextInt();
		System.out.println("Enter your working year:");
		int year = scanner.nextInt();
		bonus(salary, year);
		System.out.println("=========================================");
		//12. Take values of length and breadth of a rectangle from user and check if it is square or not.
		System.out.println("Enter the length :");
		int length = scanner.nextInt();
		System.out.println("Enter the breadth:");
		int breadth = scanner.nextInt();
		isSqure(length, breadth);
		

	}
	
	
	
	
	
	// 9. Find the given element from an Array.
	public static int findIndex(int Arrays[], int num) {

		int len = Arrays.length;
		int i = 0;
		while (i < len) {

			// if the i-th element is t
			// then return the index
			if (Arrays[i] == num) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;

	}
	
	//10. Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
	public static void findSum(int array[], int target) {
		int len = array.length;
		int[] result = new int[2] ;
		int l = 0;
		int r= len-1;
	    for (int i = 0; i < r; i++)
	    {
	        
	        for (int j = i + 1; j < len; j++)
	        {
	            
	            if (array[i] + array[j] == target)
	            {
	                System.out.println("Pair found (" + array[i] + "," + array[j] + ")");
	                return;
	            }
	        }
	    }
			
	}
	
	public static void bonus(int salary, int year) {
		double bonus = 0;
		if(year >= 5) {
			bonus = salary *0.05; 
		}
		else {
			System.out.println("You have to work more than five years to get bonus");
		}
		System.out.println("THe net bonus is: "+ bonus);
	}
	
	//12. Take values of length and breadth of a rectangle from user and check if it is square or not.
	public static boolean isSqure(int length, int breadth) {
		if (length == breadth) {
			System.out.println("it's a square");
			return true;
		}
		else {
			System.out.println("it's not a square");
		}
		return false;
		
	}

}
