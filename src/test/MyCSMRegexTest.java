package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.MyCSMRegex;

public class MyCSMRegexTest {
	
	MyCSMRegex myCustomString;
	
	@BeforeEach
	public void setUp() {
		myCustomString=new MyCSMRegex();
	}
	
		
	@Test
	public void replaceAllDigitsTest() {
		myCustomString.setMyString("987tyu88uu");
		myCustomString.replaceAllDigits('X');
		assertEquals("XXXtyuXXuu", myCustomString.getMyString());	
	}
	
	@Test
	public void removeAllNonCharactersTest() {
		myCustomString.setMyString("987tyu10uu");
		myCustomString.removeAllNonCharacters();
		assertEquals("tyuuu", myCustomString.getMyString());
		
	}
	
	@Test
	public void removeTrailingNonCharactersTest() {
		
		myCustomString.setMyString("987tyu10uu.!.");
		myCustomString.removeTrailingNonCharacters();
		assertEquals("987tyu10uu", myCustomString.getMyString());
	}
	
	@Test
	public void removeTrailingNonCharactersTest2() {
		
		myCustomString.setMyString("987tyu10uu.!!@");
		myCustomString.removeTrailingNonCharacters();
		assertEquals("987tyu10uu", myCustomString.getMyString());
	}
	

}
