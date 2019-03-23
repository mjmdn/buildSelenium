package week1.day1;

import cucumber.api.java.tr.Ve;

public class Vehicle {

	String modelofVehicle = "Yemaha FZ";
	char logofFirstCharecter = 'Y';
	static int numberofWheels = 2;
	static boolean punctured = false;
	static int wheels = 2;

	static int a = 2;
	static int b = 5;
	static int c = 1;

	public void appliyBreak() {
		System.out.println("Break applied");
	}

	public int getNumberofWheels(int numberofWheels) {
		return numberofWheels;

	}

	public boolean isPunctured(boolean punctured) {
		return punctured;

	}

	public void greterNumber(int a, int b, int c) {
		if ((a > b) && (a > c)) {
			System.out.println("Greater number Is" + a);
		} else if ((b > a) && (b > c)) {
			System.out.println("Greater number Is" + b);
		} else {
			System.out.println("Greater number Is*******" + c);
		}

	}

	public void findtypeofVehicle(int wheels) {

		/*
		 * if (wheels == 2) { System.out.println("My vehicle is Two wheelar"); }
		 * 
		 * else if (wheels == 4) { System.out.println("My vehicle is Four wheelar"); }
		 * 
		 * else { System.out.println("None of this"); }
		 */

		switch (wheels) {
		case 2:
			System.out.println("My vehicle is Two wheelar");
			break;
		case 4:
			System.out.println("My vehicle is Two wheelar");
			break;
		default:
			System.out.println("None of this");
			break;

		}

	}

	public void sum() {
		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum = sum + j;
		}

		System.out.println("Sum of 1 to 10 >>>>>>>>>>" + sum);

	}

	public void oddnumber() {

		int x = 20;
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

	public void primenumber() {

		int i = 0;
		int num = 0;

		String primeno = " ";

		for (i = 1; i < 10; i++) {
			int count = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					count = count + 1;
					System.out.println(num);

				}

			}
			if (count == 2) {

				primeno = primeno + i;

			}
		}

	}

	public void printcarlist() {
		String[] car = { "Swift", "BMW", "Ford", "Jaguar" };

		for (int x = 0; x < car.length; x++) {
			System.out.println("My cars are ----->" + car[x]);
		}

	}

	public void f()
	{

	}

	public static void main(String[] args) {

		Vehicle vh = new Vehicle();
		/*
		 * vh.appliyBreak(); int noofwheels = vh.getNumberofWheels(numberofWheels);
		 * System.out.println("No of wheels in my Bike >>>>>" + noofwheels); boolean
		 * puncturestastus = vh.isPunctured(punctured);
		 * System.out.println("My bike wheel status >>>>>>>>>" + puncturestastus);
		 * 
		 * vh.greterNumber(a, b, c);
		 * 
		 *  vh.findtypeofVehicle(wheels); 
		 *  
		 *  vh.sum();
		 */


		vh.oddnumber();

		vh.primenumber();
		vh.printcarlist();
		
		
		
		
		


	}

}
