package de.schildbach.pte.dto;

public class Score {

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
