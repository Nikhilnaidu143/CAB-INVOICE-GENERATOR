package com.cabinvoice.generator;

public class PremiumInvoice {
	
	/*** STEP-5:- Premium Rides(Bonus). ***/
	
	/*** Constants. ***/
	private static final double PREMIUM_COST_PER_KILOMETER = 15.0;
	private static final int PREMIUM_COST_PER_MINUTE = 2;
	private static final int PREMIUM_MINIMUM_FARE = 20;
	
	/** Calculating totalFare for premium customers. **/
	public double calculateFare(double distance , int time) {
		double totalFare = distance * PREMIUM_COST_PER_KILOMETER + time * PREMIUM_COST_PER_MINUTE;
		return Math.max(totalFare, PREMIUM_MINIMUM_FARE);
	}
	
	/** Calculating total Fare for multiple premium rides. **/
	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0;
		
		for (Ride ride : rides) {
			totalFare += this.calculateFare(ride.DISTANCE , ride.TIME);
		}
		
		return new InvoiceSummary(rides.length, totalFare);
	}
}
