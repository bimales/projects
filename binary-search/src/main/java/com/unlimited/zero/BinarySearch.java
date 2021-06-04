package com.unlimited.zero;

public class BinarySearch {

	public static void main(String[] args) {

		// input
		int[] array = { 1, 3, 4 };
		int low = 0;
		int high = array.length;
		// target
		int target = 1;

		int result = binarySearchRecursive(array, low, high, target);
		if (result == -1) {
			System.out.println("Target not found");
		} else {
			System.out.println("Target found at index : " + result);
		}

	}

	private static int binarySearchRecursive(int[] array, int low, int high, int target) {

		int mid = (low + high) / 2;

		// base condition
		if (target == array[mid]) {
			return mid;
		}
		// base condition
		if (high < low) {
			return -1;
		}
		if (target < array[mid]) {
			high = mid - 1;
			return binarySearchRecursive(array, low, high, target);
		} else if (target > array[mid]) {
			low = mid + 1;
			return binarySearchRecursive(array, low, high, target);
		} else {
			return -1;
		}
	}

}
