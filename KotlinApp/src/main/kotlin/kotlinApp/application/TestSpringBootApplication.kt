package kotlinApp.application

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(scanBasePackages = arrayOf("kotlinApp.controllers", "kotlinApp.servicesImpl"))
open class TestSpringBootApplication

fun main(args: Array<String>) {
	SpringApplication.run(TestSpringBootApplication::class.java, *args)
}
