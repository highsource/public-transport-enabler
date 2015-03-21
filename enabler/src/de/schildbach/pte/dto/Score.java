package de.schildbach.pte.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Score implements Serializable {

	public double value;

	public Score(double value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return "Score{value=" + value + "}";
	}

}
