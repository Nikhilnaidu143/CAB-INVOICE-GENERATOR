package com.cabinvoice.generator;

public class InvoiceGenerator {

	/** Constant variables. **/
	public final double COST_PER_KILOMETER = 10.0;
	public final int COST_PER_MINUTE = 1;
	public final int MINIMUM_FARE = 5;

	/** Calculating fare method. **/
	public double calculateFare(double distance, int time) {
		double totalFare = distance * COST_PER_KILOMETER + time * COST_PER_MINUTE;
		return Math.max(totalFare, MINIMUM_FARE);
	}

	/*** Calculate fare for multiple rides. ***/
	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0;

		for (Ride ride : rides) {
			totalFare += this.calculateFare(ride.DISTANCE, ride.TIME);
		}
		return new InvoiceSummary(rides.length, totalFare);
	}
}
