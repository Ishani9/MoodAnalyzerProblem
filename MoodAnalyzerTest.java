package com.bl.testingUserReg;


import static org.junit.Assert.*;
import org.junit.Test;


public class MoodAnalyzerTest {
	
	MoodAnalyzer mood = new MoodAnalyzer();
	
	@Test
	public void givenMood_WhenSad_ShouldReturnSad() {
		assertEquals("SAD", mood.analyseMood("I am in Sad mood"));
	}
	
	@Test
	public void givenMood_WhenInAnyMood_ShouldReturnHappy() {
		assertEquals("HAPPY", mood.analyseMood("I am in any mood"));
	}

}
