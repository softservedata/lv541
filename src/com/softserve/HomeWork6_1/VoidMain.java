package com.softserve.HomeWork6_1;

public class VoidMain {

	public static void main(String[] args) {
		Bird[] ListBird = {new Chiken("some1"),new Eagle("some2"),new Penguin("some3"),new Swallow("some3")};
		for (Bird curent : ListBird) {
			System.out.println(curent);
		}

	}

}
