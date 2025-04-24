package week2.day4;

public class LearnStaticPolymorphism {

	public void addNum(int a,int b) {
      int c=a+b;
      System.out.println("addition of two argument :"+ c);
	}
	public void addNum() {
		int a =5;
		int b =6;
		int c=a+b;
		System.out.println("No argument method :"+c);
		
	}
	public void addNum(int a,int b,int c){
		int d=a+b+c;
	      System.out.println("addition of three argument :"+ d);
	      System.out.println(true);
	      System.out.println(182);
	}
	public void addNum(double a,double b) {
	      double c=a+b;
	      System.out.println("addition of two argument :"+ c);
		}
	
	public static void main(String[] args) {
		LearnStaticPolymorphism lsp = new LearnStaticPolymorphism();
		lsp.addNum(43,53,1500);
		lsp.addNum();
		lsp.addNum(12, 24);
	}
}
