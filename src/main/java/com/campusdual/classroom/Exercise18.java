package com.campusdual.classroom;

public class Exercise18 {

	public static void main(String[] args) {
		createAndInitializeArray(5);
		showInlineArray(createAndInitializeArray(5));
	}

	public static int[] createAndInitializeArray(int tam){
		int[] arInt = new int[tam];
		for (int i = 0; i < arInt.length; i++) {
			arInt[i] = i+1;
		}
		return arInt;
	}

	public static void showInlineArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			if(i > 0){
				System.out.print(" ");
			}
			System.out.print(arr[i]);
		}
		/*int[] arInt = arr;
		for (int i = 1; i < arInt.length+1 ; i++) {


			System.out.print(i+" ");
		}*/
	}
}
