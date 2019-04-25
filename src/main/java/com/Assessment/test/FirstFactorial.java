package com.Assessment.test;

public class FirstFactorial {

	private int input;
	private int output;
	public FirstFactorial(int input){
			this.input = input;	
	}
	public int getInput() {
		return this.input;
	}
	public void setInput(int input) {
	    this.input = input;    
	}
	public int getOutput() {
		output = 1;
		for(int i=1;i<=this.input;i++) 
			output = output*i;
		return output;
	}
}
