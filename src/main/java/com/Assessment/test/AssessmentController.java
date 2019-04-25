package com.Assessment.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssessmentController {
	
	List<FirstFactorial> fact = new ArrayList<>(Arrays.asList(
    		new FirstFactorial(4)
    ));
	
    List<FirstReverse> reverse = new ArrayList<>(Arrays.asList(
    		new FirstReverse("codebyte")
    ));
    
    List<AlphabetSoup> soup = new ArrayList<>(Arrays.asList(
    		new AlphabetSoup("codebyte")
    ));
   
@RequestMapping("/api/firstfactorial")
	public List<FirstFactorial> getFact() {
	    return fact;
	}
@RequestMapping("/api/rirstreverse")
	public List<FirstReverse> getReverse() {
	    return reverse;
	}
@RequestMapping("/api/alphabetsoup")
	public List<AlphabetSoup> getSoup() {
	    return soup;
	}
}
