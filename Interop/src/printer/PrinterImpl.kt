package printer

open class PrinterInteropImpl(val prefix: String?) : Printer {
	override fun print(sentence: String?) = if(sentence is String) safePrint(sentence) else printNull()
	
	fun safePrint(sentence: String) = println(this.prefix + sentence.trim())
	fun printNull() = println(this.prefix + "The sentence is NULL, but we are safe.")
}