package com.qa.qacommunity;

public class Exam_Results {
	
	public static void main(String[] args) {
		
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
