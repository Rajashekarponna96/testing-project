package com.safesmart.safesmart.model;

public enum Dollar {
	$1("$1", 1), $2("$2", 2), $5("$5", 5), $10("$10", 10), $20("$20", 20), $50("$50", 50), $100("$100", 100);

	private String dollar;
	private String dollar1;
		private String dollar2;
	private String dollar3;
	private String dollar4;
	private String dollar5;

	private int value;

	public String getDollar() {
		return dollar;
	}

	public int getValue() {
		return value;
	}

	Dollar(String dollar, int value) {
		this.dollar = dollar;
		this.value = value;
	}

}
