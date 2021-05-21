package com.qa.qacommunity;

public class Arrays_task {
	
	public static void main(String[] args) {

int Array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
System.out.println(Array1[1]);
		
int Array2[] = new int [4];

for (int i = 0; i < Array2.length; i++) {
	Array2[i] = i;
	System.out.println(Array2[i]);
}

for (int i = 0; i < Array1.length; i++) {
	int multiplyArray = Array1[i] * 10;
	
	Array1[i] = multiplyArray;
	System.out.println(Array1[i]);
	
}



}

}
