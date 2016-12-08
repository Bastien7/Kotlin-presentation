package example1

object Example1 {
	fun hello(): String = "[KOTLIN]Hello, I'm writing something in the console."
	fun sayHello() = println(hello())

	@JvmStatic fun main(args: Array<String>) {
		sayHello()
	}
}
