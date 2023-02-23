package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class colorchange {
@GetMapping("dev")

public String name()
{
	String color="Green";
	return "My favorite color is "+color;
}
}



