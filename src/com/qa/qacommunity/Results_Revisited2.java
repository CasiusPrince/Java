package com.qa.qacommunity;

public class Results_Revisited2 {
	public static int physics;
	public static int chemistry;
	public static int biology;
	public static int total;
	public static double percentage;

	public static void main(String[] args) {

	}

	public static void results(int physicsGrade, int chemGrade, int biologyGrade) {
		physics = physicsGrade;
		chemistry = chemGrade;
		biology = biologyGrade;
		calcTotal();
		if (((physics * 100) / 150) > 60) {
			System.out.println("Physics grade is: " + physics + "Percentage total: " + ((physics * 100) / 150));

		} else {
			System.out.println("You have failed physics");
		}
		
		if (((chemistry * 100) / 150) > 60) {
			System.out.println("Chemistry grade is: " + chemistry + "Percentage total: " + ((chemistry * 100) / 150));

		} else {
			System.out.println("You have failed chemistry");
		}
		
		if (((biology * 100) / 150) > 60) {
			System.out.println("Biology grade is: " + biology + "Percentage total: " + ((biology * 100) / 150));

		} else {
			System.out.println("You have failed biology");
		}
		
	}

	public static void calcTotal() {
		total = physics + chemistry + biology;
		percentage = (total * 100) / 450;

	}

	
	
}
