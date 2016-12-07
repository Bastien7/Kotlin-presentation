package example2

class PrinterImpl(val prefix: String) : Printer {
	override fun print(sentence: String) = println(this.prefix.trim() + " " + sentence.trim())
}
