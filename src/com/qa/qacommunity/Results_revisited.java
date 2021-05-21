package com.qa.qacommunity;

public class Results_revisited {
	
	
	public static int result;
	public static double total;
	public static double result2;
	public static double biologyPercentage;
	public static double chemistryPercentage;
	public static double physicsPercentage;
	public static void main(String[] args) {
		
		examMarks(150,150,84);
		
		System.out.println(percentage(150,150,84));
		System.out.println("the percentage received overall in the exam was " + total + "%");
		
		if (total<60.0|
				biologyPercentage<60.0
				|chemistryPercentage< 60.0
				|physicsPercentage< 60.0) {System.out.println("Unfortunatly you have not passed") ;}
		if (biologyPercantage<60.0) {System.out.println("Unfortunately you have not passed Biology") ;
		} else if (chemistryPercentage <60.0) (System.out.println("Unfortunately you have failed Chemistry");}
	
		}
		
		displayResults();
		calcResults();
		
	}

	private static void displayResults() {
		
		String physicsExam = "Physics " + 90;
		String chemistryExam = "Chemistry " + 90;
		String biologyExam = "Biology " + 80;
		
		System.out.println(physicsExam);
		System.out.println(chemistryExam);
		System.out.println(biologyExam);
		
	}
	
	private static void calcResults() {
		
		int physicsExam = 90;
		int chemistryExam = 90;
		int biologyExam = 80;
		
		int totalResults = physicsExam + chemistryExam + biologyExam;
		
		int percentageResults = (totalResults *100) / 450;
		
		String printablePercResults = "Final Result:" + percentageResults + "%";
		System.out.println(printablePercResults);
		
	}
	
	
	
}
