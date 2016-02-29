package org.bm.spring.service;

import org.bm.spring.model.Circle;
import org.bm.spring.model.Triangle;

public class ShapeService {

	private Circle circle;
	private Triangle tiangle;

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(final Circle circle) {
		this.circle = circle;
	}

	public Triangle getTiangle() {
		return tiangle;
	}

	public void setTiangle(final Triangle tiangle) {
		this.tiangle = tiangle;
	}

}
