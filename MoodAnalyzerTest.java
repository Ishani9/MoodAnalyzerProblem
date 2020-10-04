package com.bl.testingUserReg;


import static org.junit.Assert.*;
import org.junit.Test;


public class MoodAnalyzerTest {
	@Test
	public void givenMood_WhenSad_ShouldReturnSad() {
		MoodAnalyzer mood = new MoodAnalyzer("I am in Sad mood");
		assertEquals("SAD", mood.analyseMood());
	}
	
	@Test
	public void givenMood_WhenInAnyMood_ShouldReturnHappy() {
		MoodAnalyzer mood = new MoodAnalyzer("I am in Happy mood");
		assertEquals("HAPPY", mood.analyseMood());
	}
	
	@Test
	public void givenMood_WhenNull_ShouldReturnHappy() {
		MoodAnalyzer mood = new MoodAnalyzer(null);
		assertEquals("HAPPY", mood.analyseMood());
	}

}
