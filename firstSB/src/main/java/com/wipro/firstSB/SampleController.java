package com.wipro.firstSB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
	
	@ResponseBody
	@GetMapping(path="/name")
	public String getName() {
		return "welcome.html";
	}
}
