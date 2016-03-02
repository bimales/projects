package org.bm.immutable;

import java.util.Date;

public class Application {

	public static void main(final String[] args) {
		final ImmutableEmployee employee = new ImmutableEmployee("Bimales Mandal", "XYZ", new Date(1985, 8, 25));
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Employee PAN: " + employee.getPanCardNumber());
		System.out.println("Employee DOB: " + employee.getDOB());
	}

}
