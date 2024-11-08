package com.ms.deploytutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DeploytutorialApplication

fun main(args: Array<String>) {
	runApplication<DeploytutorialApplication>(*args)
}

@RestController
class HelloController{
	@GetMapping("/hello")
	fun hello():String{
		return "hello osvaldo"
	}
}
