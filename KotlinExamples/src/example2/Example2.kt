package example2

object Example2 {
	@JvmStatic fun main(args: Array<String>) {
		var printer = PrinterImpl(" [KOTLIN] ")

		printer.print(" Hello, I'm writing someting in the console. ")
		//printer.print(null) //This cannot compile
	}
}
