//Class Name: BIFS618-9040
//Homework assignment 2, questions 1 & 2
//File name: hmk2_1.java
//Program author name: Albakry_Koroma

import java.util.Scanner; // program uses class Scanner

public class hwk2_1{

// main method begins execution of Java application
	public static void main(String[] args){

		// create a DNA Pattern to test for validity
		DNA dna = new DNA();
		dna.name = "AGTCGTCTCC";  // sequence to test for validity

		// test for validity
		if(DNA.isDNAvalid()==0){
			System.out.printf("DNA sequence "+dna+" is valid\n");
		}else{
			System.out.printf("DNA sequence "+dna+" is NOT valid\n");
		} // end of validity test
		
		System.out.printf("DNA sequence "+dna+" has length %d%n",dna.getSize());
		
	} // end of main
	
} // end class Assignment_02
