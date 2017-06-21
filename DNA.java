//Class Name: BIFS618-9040
//Homework assignment 2, questions 1 & 2
//File name: DNA.java
//Program author name: Albakry_Koroma

public class DNA{

	public String dna; // instance variable
	
	// method to set the name in the object
	public void setName(String name){
		this.name = name; // store the name
	}
	
	// method to retrieve the name from the object
	public String getName(){
		return name; // return value of name to caller
	}

// The DNA class containes methods to:
//	a) test validity of a DNA sequence
//	b) get the size of a sequence
//	c) get the percentage representation a genome in a sequence

	public static int isDNAvalid(String arg){
		int result  = 0; // if changed to 1 later, then DNA not valid
		int counter = 0;
		for (counter = 0; counter < getSize(arg); counter++){
			if ('A' == arg.charAt(counter) || 'G' == arg.charAt(counter) || 
				'C' == arg.charAt(counter) || 'T' == arg.charAt(counter)) {
				continue;
			}else{
				result = 1;
			}
		} // end of for loop
	return result;
	} // end of isDNAvalid
	
	public static int getSize(String arg){
		return arg.length();
	} // end of getSize

} // end of class DNA

