package com.example.backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {

	@RequestMapping(value="info")
	public String info()
	{
		return "Working Talent Library - Created by Christian, Judith, Ruud and Michel";
	}
}
