package com.sv.dpc.codingtest;

import java.util.InputMismatchException;

import static org.junit.Assert.*;
import org.junit.Test;

public class ApplicationTest {

	@Test(expected = InputMismatchException.class)
	public void test_invalidateInput() {
		call_removeElements(10, 0);
	}

	@Test
	public void test_validInput() {
		Result result = call_removeElements(10, 5);
		assertEquals(3, result.getWinningId());
	}

	private Result call_removeElements(int n, int k) {
		return ApplicationUtil.findWinner(n, k);
	}
}
