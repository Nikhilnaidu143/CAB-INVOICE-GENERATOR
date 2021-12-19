package com.cabinvoice.generator;

public class InvoiceGenerator {

	/** Constant variables. **/
	public static final double COST_PER_KILOMETER = 10.0;
	public static final int COST_PER_MINUTE = 1;

	/** Calculating fare method. **/
	public double calculateFare(double distance, int time) {
		return distance * COST_PER_KILOMETER + time * COST_PER_MINUTE;
	}
}
