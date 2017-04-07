package printer;

//Kotlin is designed with Java Interoperability in mind
public class ExampleInterop {

	public static void main(String[] args) {
		Printer printer = new PrinterInteropImpl("[JAVA+KOTLIN]");
		
		printer.print(" Hello, I'm writing something in the console. ");
		printer.print(null);
	}
}
