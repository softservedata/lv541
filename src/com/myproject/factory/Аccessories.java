package com.myproject.factory;

public class �ccessories {

	private int id;

	
	@Override
	public String toString() {
		return "�ccessor [id=" + id + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public �ccessories(int id) {
		this.id = id;
	}
}
