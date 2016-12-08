package example2;

public class PrinterImpl implements Printer {
	private String prefix;

	public PrinterImpl(String prefix) {
		this.prefix = prefix;
	}

	@Override
	public void print(String sentence) {
		System.out.println(this.prefix + sentence.trim());
	}
}
