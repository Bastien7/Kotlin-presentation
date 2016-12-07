object Example1 {
	fun hello(): String = "[KOTLIN] Hello, I'm writing someting in the console."
	fun sayHello() = println(hello())

	@JvmStatic fun main(args: Array<String>) {
		sayHello()
	}
}
