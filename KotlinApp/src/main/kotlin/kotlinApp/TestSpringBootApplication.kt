package kotlinApp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class TestSpringBootApplication

fun main(args: Array<String>) {
	SpringApplication.run(TestSpringBootApplication::class.java, *args)
}
