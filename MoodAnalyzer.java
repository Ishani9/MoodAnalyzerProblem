package com.bl.testingUserReg;

public class MoodAnalyzer {
	
	public String analyseMood(String message){
		message = message.toLowerCase();
		if(message.contains("sad")) {
			return "SAD";
		}
		else {	
			return "HAPPY";
		}
	}
}
