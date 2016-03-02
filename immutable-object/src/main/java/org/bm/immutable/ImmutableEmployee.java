package org.bm.immutable;

import java.util.Date;

public final class ImmutableEmployee {

	private final String name;
	private final String panCardNumber;
	private final Date dob;

	public ImmutableEmployee(final String name, final String panCardNumber, final Date dob) {
		this.name = name;
		this.panCardNumber = panCardNumber;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public String getPanCardNumber() {
		return panCardNumber;
	}

	public Date getDOB() {
		// In this example of creating immutable class, Date is a mutable
		// object. If getDOB() returns actual Date object than despite
		// dob being final variable, internals of Date can be modified
		// by client code. By returning clone() or copy of dob, we
		// avoid that danger and preserves immutability of class.

		return (Date) dob.clone();
	}

}
