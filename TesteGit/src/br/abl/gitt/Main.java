package br.abl.gitt;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		displayGreeting();
		data.display();
		System.out.println("teste");
	}
	
	private static void displayGreeting() {
		System.out.println("HELLO HAPPY SALES PEOPLE!");
		System.out.println("THIS APP SHOWS SALES DATA");
	}
}
