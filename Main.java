package com.SGrano;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = 5;
	    int[] array = new int[number];
	    int[] reverseArray = new int[number];
        System.out.println("Input " + number + " numbers.");
	    for(int i = 0; i < array.length;i++){
	        array[i] = scanner.nextInt();
        }
        System.out.println("The non-reversed array is " + Arrays.toString(array));
        System.out.println("The reversed array is " + Arrays.toString(Reverse(array, reverseArray)));
    }
    public static int[] Reverse(int[] array, int[] reverseArray){
        int j = 0;
        for(int i = array.length-1; i > -1;i--){
            reverseArray[j++] = array[i];
        }
        return reverseArray;
    }

}

