package week6.day4;

public class LearnEncapsulation {
	
	private String browserName;
	// private final static
	private static ThreadLocal<String> browser = new ThreadLocal<String>() ;
	public static String getBrowser() {
		return browser.get();
	}

	public String getBrowserName() {
		return browserName;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}
	
	public static void main(String[] args) {
		LearnEncapsulation le = new LearnEncapsulation();
		le.browserName="Edge";
		System.out.println(le.browserName);
		browser.set("Firefox");
		System.out.println(getBrowser());
		
	}

}
