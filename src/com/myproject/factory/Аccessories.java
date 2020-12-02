package com.myproject.factory;

public class Àccessories {

	private int id;

	
	@Override
	public String toString() {
		return "Àccessor [id=" + id + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Àccessories(int id) {
		this.id = id;
	}
}
