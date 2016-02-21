package org.bm.parser.pojo;

public class Note {

	private int id;
	private String to;
	private String from;
	private String heading;
	private String body;

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getTo() {
		return to;
	}

	public void setTo(final String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(final String from) {
		this.from = from;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(final String heading) {
		this.heading = heading;
	}

	public String getBody() {
		return body;
	}

	public void setBody(final String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		final StringBuilder stingBuilder = new StringBuilder();
		stingBuilder.append("ID : " + getId());
		stingBuilder.append("\n TO : " + getTo());
		stingBuilder.append("\n FROM : " + getFrom());
		stingBuilder.append("\n HEADING : " + getHeading());
		stingBuilder.append("\n BODY : " + getBody());
		return stingBuilder.toString();
	}

}
