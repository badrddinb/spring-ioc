package com.badrddinb.spring.springiocxml

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.ClassPathXmlApplicationContext

@SpringBootApplication
class SpringIocXmlApplication

fun main() {
	// Load spring menu configuration context
	val menuContext = ClassPathXmlApplicationContext("menu-beans-config.xml")

	// Retrieve menu bean from spring container
	val menu: Menu = menuContext.getBean("menu", Menu::class.java)

	// Call bean's method
	println(menu.getItem())

	// Close menu configuration context
	menuContext.close()
}
