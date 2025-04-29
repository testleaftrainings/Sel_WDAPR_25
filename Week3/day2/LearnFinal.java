package week3.day2;

public final class LearnFinal {

	final int num=9;
	
	public final void value() {
		System.out.println("Final Method : "+ num);
	}
	
	public static void main(String[] args) {

		
		LearnFinal lf = new LearnFinal();
		System.out.println(lf.num);
		lf.value();
		
	}

}
