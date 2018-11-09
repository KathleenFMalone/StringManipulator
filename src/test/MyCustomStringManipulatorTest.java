package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.MyCustomStringManipulator;

public class MyCustomStringManipulatorTest {
	
	MyCustomStringManipulator myCustomString;
	
	@BeforeEach
	public void setUp() {
		myCustomString=new MyCustomStringManipulator();
	}
	
	@Test
	public void countDigitsTest() {
		myCustomString.setMyString("987tyu10uu");
		assertEquals(5, myCustomString.countDigits());
	}
	
	@Test
	public void replaceAllDigitsTest() {
		myCustomString.setMyString("987tyu10uu");
		myCustomString.replaceAllDigits('X');
		assertEquals("XXXtyuXXuu", myCustomString.getMyString());	
	}
	
	@Test
	public void changeToUpperCaseTest() {
		
		myCustomString.setMyString("987tyu10uu");
		myCustomString.changeToUpperCase();;
		assertEquals("987TYU10UU", myCustomString.getMyString());			
	}
	
	@Test
	public void changeToLowerCaseTest() {
		
		myCustomString.setMyString("987TYU10UU");
		myCustomString.changeToLowerCase();;
		assertEquals("987tyu10uu", myCustomString.getMyString());		
	}
	
	@Test
	public void removeAllNonCharactersTest() {
		myCustomString.setMyString("987tyu10uu");
		myCustomString.removeAllNonCharacters();
		assertEquals("tyuuu", myCustomString.getMyString());
		
	}
	
	@Test
	public void removeTrailingNonCharactersTest() {
		
		myCustomString.setMyString("987tyu10uu.");
		myCustomString.removeTrailingNonCharacters();
		assertEquals("987tyu10uu", myCustomString.getMyString());
	}

}
