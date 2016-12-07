package example2;

public class Example2 {

	public static void main(String[] args) {
		Printer printer = new PrinterImpl("Hello, I'm writing someting in the console. ");
		printer.print();
		
		printer = new PrinterImpl(null);
		printer.print();
	}

}
