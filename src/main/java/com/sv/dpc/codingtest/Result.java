package com.sv.dpc.codingtest;

import java.util.List;

/**
 * @author Prakash
 * 
 *         Object to hold results from the process
 *
 */
public class Result {

	private int winningId;
	private List<Integer> removedSequence;

	public Result(int winningId, List<Integer> removedSequence) {
		super();
		this.winningId = winningId;
		this.removedSequence = removedSequence;
	}

	public int getWinningId() {
		return winningId;
	}

	public void setWinningId(int winningId) {
		this.winningId = winningId;
	}

	public List<Integer> getRemovedSequence() {
		return removedSequence;
	}

	public void setRemovedSequence(List<Integer> removedSequence) {
		this.removedSequence = removedSequence;
	}

}
