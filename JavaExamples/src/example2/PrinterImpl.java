package example2;

public class PrinterImpl implements Printer {
	private final static String prefix = "[JAVA] ";
	public String sentence;

	public PrinterImpl(String sentence) {
		this.sentence = sentence;
	}

	@Override
	public void print() {
		System.out.println(prefix + this.sentence.trim());
	}
}
