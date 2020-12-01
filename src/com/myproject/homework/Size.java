package com.myproject.homework;

public enum Size {
	SIZE10(10),
	SIZE20(20),
	SIZE30(30);
	private int values;
	
	Size(int values) {
		this.values = values;
	}


	int getValue() {
		return values;
	}
	

}
