package main;

public class MyCustomString {
	
	String myString;

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}
		
	/**
	 * Replaces all digits with the given character
	 * @param c
	 */
	public void replaceAllDigits(char c) {
		//create new String character by character
		String temp="";
		for(int i=0;i<myString.length();i++) {
			if(Character.isDigit(myString.charAt(i))) {
				temp+=Character.toString(c);
			} else {
				temp+=Character.toString(myString.charAt(i));
			}
		}
		myString=temp;		
	}
	
	/**
	 * Remove all non characters in the String
	 */
	public void removeAllNonCharacters() {
		String temp="";
		for(int i=0;i<myString.length();i++) {
			if(Character.isLetter(myString.charAt(i))) {
				temp+=Character.toString(myString.charAt(i)).toLowerCase();
			} 
		}
		myString=temp;			
	}
	
	/**
	 * Removes trailing non characters
	 */
	public void removeTrailingNonCharacters() {
		
		if(!Character.isLetter(myString.charAt(myString.length()-1)) ) {
			myString=myString.substring(0, myString.length()-1);
		}
	}


}
