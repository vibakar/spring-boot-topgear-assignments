package com.wipro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControler {

	@GetMapping(path = "/name")
	public String displayName() {
		return "<h3>Bank Name:</h3> <p>Axis Bank</p>";
	}

	@GetMapping(path = "/address")
	public String displayAddress() {
		return "<h3>Bank Address:</h3> <p>Ward No 85, <br>Site No 302<br> Khata No 298/275/302,<br>AECS Layout,<br>Bengaluru, Karnataka 560037</p>";
	}
}
