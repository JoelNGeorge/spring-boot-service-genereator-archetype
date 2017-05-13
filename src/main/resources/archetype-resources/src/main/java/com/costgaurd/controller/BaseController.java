package com.costgaurd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.costgaurd.beans.Simple;

@RestController
@RequestMapping("/app")
public class BaseController {

	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody Simple sayHello() {
		return new Simple("Hello, Application Started !", 1);
	}

}
