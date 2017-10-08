package org.learning.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController ("/greeting")
public class GreetingController {
	
	@GetMapping
	@ResponseBody
	public String Greeting () {
		return "Hello!!!";
	}

}
