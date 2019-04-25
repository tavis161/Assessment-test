package com.Assessment.test;

public class AlphabetSoup {

	private String input;
	private String output;
	public AlphabetSoup(String input){
			this.input = input;	
	}
	public String getInput() {
		return this.input;
	}
	public void setInput(String input) {
	    this.input = input;    
	}
	public String getOutput() {
		char[] word = this.input.toCharArray();
		StringBuffer buffer = new StringBuffer();
		for (int i = 1; i < word.length; i++) {
		    for (int j = i; j > 0; j--) {
		    	if (word[j] < word[j - 1]) {
		    		char temp = word[j];
		    		word[j] = word[j - 1];
		    		word[j - 1] = temp;
		    	}
		    }
		}
		for (int i = 0; i < word.length; i++) {
			buffer.append(word[i]);
		}
		return buffer.toString();
	}
}
