package com.bl.testingUserReg;

public class MoodAnalyzer{
	
	String message;
	
	public MoodAnalyzer(){
		
	}
	
	public MoodAnalyzer(String message){
		this.message = message;
	}
	
	public String analyseMood() throws MoodAnalyzerException {
		try {
			message = message.toLowerCase();
			if(message.contains("sad")) {
				return "SAD";
			}
		}
		catch(NullPointerException exception) {
			throw new MoodAnalyzerException("Mood can not be "+ InvalidMood.NULL + " Please enter a valid mood.");
		}
		
		if(message==" ") {
			throw new MoodAnalyzerException("Mood can not be "+ InvalidMood.EMPTY + " Please enter a valid mood.");
		}
		
		else {
			return "HAPPY";
		}
	}
}
