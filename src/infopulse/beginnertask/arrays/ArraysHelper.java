package infopulse.beginnertask.arrays;

import java.util.Arrays;
import java.util.Scanner;

import infopulse.beginnertask.cyclesfor.CandyPrice;

public class ArraysHelper {

	public static void print(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.println("mas[" + i + "] = " + mas[i]);
		}
	}

	public static void generate(int[] mas, int n) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * n);
		}
	}
	
	public static void main(String[] args) {
		int k=3;
		int n=10;
		int[] arr = new int[n];
		generate(arr,20);
		System.out.println(Arrays.toString(arr));
		RemoveElement.remove(arr,k);
		
} 
	
}