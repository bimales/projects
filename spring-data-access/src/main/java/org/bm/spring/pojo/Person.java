package org.bm.spring.pojo;

public class Person {

	private int personId;
	private String lastName;
	private String firstName;
	private String address;
	private String city;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(final int personId) {
		this.personId = personId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(final String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("\nPerson Name : " + getFirstName() + " " + getLastName());
		sb.append("\nAddress : " + getAddress());
		sb.append("\nCity : " + getCity());
		return sb.toString();
	}
}
