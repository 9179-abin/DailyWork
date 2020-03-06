package com.cts.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping("/languages")
	public List<String> languages(){
		return new ArrayList<String>(Arrays.asList("Java","Python","C++","Ruby"));
	}


}
