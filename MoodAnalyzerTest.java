package com.bl.testingUserReg;


import static org.junit.Assert.*;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	//TEST FOR SAD MOOD
	@Test
	public void givenMood_WhenSad_ShouldReturnSad() {
		try {
			MoodAnalyzer mood = new MoodAnalyzer("I am in Sad mood");
			assertEquals("SAD", mood.analyseMood());
		}
		catch(MoodAnalyzerException e) {
			System.out.println(e);
		}
	}
	
	//TEST FOR HAPPY MOOD
	@Test
	public void givenMood_WhenInAnyMood_ShouldReturnHappy() {
		try {
			MoodAnalyzer mood = new MoodAnalyzer("I am in Any mood");
			assertEquals("HAPPY", mood.analyseMood());
		}
		catch(MoodAnalyzerException e) {
			System.out.println(e);
		}
	}
	
	//TEST FOR NULL
	@Test
	public void givenMood_WhenNull_ShouldThrowMoodAnalysisException() {
		try {
			MoodAnalyzer mood = new MoodAnalyzer(null);
			assertEquals("HAPPY", mood.analyseMood());
		}
		catch(MoodAnalyzerException e) {
			System.out.println(e);
		}
	}
	
	// TEST FOR EMPTY
	@Test
	public void givenMood_WhenEmpty_ShouldThrowMoodAnalysisException() {
		try {
			MoodAnalyzer mood = new MoodAnalyzer(" ");
			assertEquals("HAPPY", mood.analyseMood());
		}
		catch(MoodAnalyzerException e) {
			System.out.println(e);
		}
	}

}
