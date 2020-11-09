package Homework;

public abstract class Bird {
	abstract boolean fly();
	private boolean feather;
	private int layEggs;
	
	public Bird() {
		layEggs=0;
		feather =true;
	}

	public Bird(boolean feather, int layEggs) {
		
		this.feather = feather;
		this.layEggs = layEggs;
	}

	public boolean isFeather() {
		return feather;
	}

	public void setFeather(boolean feather) {
		this.feather = feather;
	}

	public int getLayEggs() {
		return layEggs;
	}

	public void setLayEggs(int layEggs) {
		this.layEggs = layEggs;
	}

	@Override
	public String toString() {
		return "Bird [feather=" + feather + ", layEggs=" + layEggs + "]";
	}


	}
	

