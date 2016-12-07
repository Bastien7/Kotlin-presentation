package example2;

public class Example2 {
	public static void main(String[] args) {
		Printer printer = new PrinterImpl(" [JAVA] ");
		
		printer.print(" Hello, I'm writing someting in the console. ");
		printer.print(null);
	}
}
