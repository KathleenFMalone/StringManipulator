package main;

public class MyCSMRegex {
	
	String myString;

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}
	
		
	public void replaceAllDigits(char c) {
		//create new String character by character

		myString = myString.replaceAll("\\d", Character.toString(c));
	}
	
	public void removeAllNonCharacters() {
		
		myString = myString.replaceAll("[^a-zA-Z]", "");	
		
	}
	
	public void removeTrailingNonCharacters() {
		
		myString = myString.replaceAll("[^a-zA-Z]*$", "");
	}

}
