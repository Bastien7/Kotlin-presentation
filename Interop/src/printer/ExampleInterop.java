package printer;

public class ExampleInterop {

	public static void main(String[] args) {
		Printer printer = new PrinterInteropImpl("[JAVA+KOTLIN]");
		
		printer.print(" Hello, I'm writing something in the console. ");
		printer.print(null);
	}
}
