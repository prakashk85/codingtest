package com.sv.dpc.codingtest;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

public final class ApplicationUtil {

	// empty private constructor
	private ApplicationUtil() {
		// do nothing
	}

	/**
	 * This method finds winner id by removing every kth element from the list
	 * of n elements.
	 * 
	 * @param n
	 * @param k
	 * @return Result - winning Id & sequence of ids removed from main list
	 */
	public static Result findWinner(int n, int k) {
		validateInput(n, k);

		/**
		 * Even though LinkedList occupies more memory than ArryList, LinkedList
		 * is chosen over ArrayList as this program is mainly to remove indexed
		 * elements from list which would be quicker in LinkedList O(1) compared
		 * to ArrayList O(n).
		 */

		List<Integer> list = new LinkedList<>();
		int a = 1;

		while (a <= n) {
			list.add(a);
			a++;
		}

		/*
		 * Using ArrayList to hold removal sequence as it maintains the order of
		 * insertion
		 */
		List<Integer> removeSeq = new ArrayList<>();
		int rem = 0;

		for (int i = k - 1; list.size() > 1; i += k - 1) {
			if (i >= list.size()) {
				i = getNewIndex(i, list.size());
			}
			rem = list.remove(i);
			removeSeq.add(rem);
		}

		return new Result(list.get(0), removeSeq);

	}

	/**
	 * Validates input parameters n & k. Throws InputMismatchException if either
	 * n or k is less than 2
	 * 
	 */
	private static void validateInput(int n, int k) {
		if (n < 2 || k < 2) {
			throw new InputMismatchException();
		}
	}

	/**
	 * Gets new index if index is greater than list size
	 */
	private static int getNewIndex(int i, int size) {

		if (i >= size) {
			i -= size;
			i = getNewIndex(i, size);
		}

		return i;
	}
}
