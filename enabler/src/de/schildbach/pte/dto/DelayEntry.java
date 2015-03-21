package de.schildbach.pte.dto;

import java.util.Date;

public class DelayEntry {

	public DelayEntry() {

	}

	public DelayEntry(Date date, int delay) {
		super();
		this.date = date;
		this.delay = delay;
	}

	public Date date;
	public int delay;

}
