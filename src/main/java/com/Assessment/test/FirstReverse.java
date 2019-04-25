package com.Assessment.test;

public class FirstReverse {
	
	private String input;
	private String output;
	public FirstReverse(String input){
			this.input = input;
			
	}
	public String getInput() {
		return this.input;
	}
	public void setInput(String input) {
	        this.input = input;    
	}
	public String getOutput() {
		this.output = "";
		for (int i=this.input.length()-1;i>=0;i--) 
			output = output + this.input.charAt(i);
		return output;
	}
}

