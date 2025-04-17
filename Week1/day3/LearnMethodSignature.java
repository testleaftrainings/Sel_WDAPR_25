package week1.day3;

public class LearnMethodSignature {
	int a=10;
    public void addNumber(){
    	// declaring and initiailizing
    	int a=3;
    	System.out.println("Local variable is printed"+a);
    	int b=5;
    	int c;
    	c=a+b;
		System.out.println("This method will add two numbers :"+c);
	}
    public int calculateVolume(int length,int breadth,int height) {
    //len*bre*ht;
    	return length*breadth*height;
	}
	
	public static void main(String[] args) {
		//ClassName objectName = new ClassName();
		// Declaring object     // initialize an object
		LearnMethodSignature obj = new LearnMethodSignature();
		obj.addNumber();
		System.out.println("Global variable is printed"+obj.a);
	}
}
