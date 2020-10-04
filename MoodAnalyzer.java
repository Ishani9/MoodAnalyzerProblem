package com.bl.testingUserReg;

public class MoodAnalyzer {
	
	String message;
	
	public MoodAnalyzer(){
		
	}
	
	public MoodAnalyzer(String message){
		this.message = message;
	}
	
	public String analyseMood(){
		message = message.toLowerCase();
		if(message.contains("sad")) {
			return "SAD";
		}
		else {	
			return "HAPPY";
		}
	}
}
