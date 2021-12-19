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
	public void givenDistanceTime_shouldReturnFare() {
		double fare = invoiceGenerator.calculateFare(2.0, 5);
		Assertions.assertEquals(fare, 25);
	}
	
	@Test
	public void givenDistanceTime_shouldReturn_minimumFare() {
		double fare = invoiceGenerator.calculateFare(0.2, 1);
		Assertions.assertEquals(fare, 5);
	}
}
