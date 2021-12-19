package com.cabinvoice.generator;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class InvoiceGeneratorTest {
	InvoiceGenerator invoiceGenerator;

	/**
	 * STEP-1:- Given Distance and time ,the invoice generator should return the
	 * total fare for the journey.
	 **/

	@Before
	public void initialize() {
		invoiceGenerator = new InvoiceGenerator();
	}

	@Test
	public void givenDistanceTime_ShouldReturnFare() {
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assertions.assertEquals(fare, 25);
	}
}
