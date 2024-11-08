package com.ms.deploytutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DeploytutorialApplication

fun main(args: Array<String>) {
	runApplication<DeploytutorialApplication>(*args)
}
