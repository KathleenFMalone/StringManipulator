package main;
/**
 * This class takes a String and performs simple operations on it
 * @author kathl
 *
 */
public class MyCustomStringManipulator {
	
	String myString;

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}
	
	/**
	 * Counts the number of digits in the String
	 * @return number of digits
	 */
	public int countDigits() {
		int count = 0;
		
		for(int i=0;i<myString.length();i++) {
			if(Character.isDigit(myString.charAt(i))) {
				count++;
			}
		}
		return count;
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
	 * Changes all lower case letter to upper case
	 */
	public void changeToUpperCase() {
		
		String temp="";
		for(int i=0;i<myString.length();i++) {
			if(Character.isLowerCase(myString.charAt(i))) {
				temp+=Character.toString(myString.charAt(i)).toUpperCase();
			} else {
				temp+=Character.toString(myString.charAt(i));
			}
		}
		myString=temp;			
	}
	
	/**
	 * Changes all lower case letters to upper case
	 */
	public void changeToLowerCase() {
		
		String temp="";
		for(int i=0;i<myString.length();i++) {
			if(Character.isUpperCase(myString.charAt(i))) {
				temp+=Character.toString(myString.charAt(i)).toLowerCase();
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
	 * Removes only trailing non characters
	 */
	public void removeTrailingNonCharacters() {
		
		if(!Character.isLetter(myString.charAt(myString.length()-1)) ) {
			myString=myString.substring(0, myString.length()-1);
		}
	}

}
