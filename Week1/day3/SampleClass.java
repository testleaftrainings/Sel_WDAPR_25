package week1.day3;

public class SampleClass {

	public static void main(String[] args) {
		
        LearnMethodSignature obj = new LearnMethodSignature();
        obj.addNumber();
        int localVariable = obj.calculateVolume(12, 13, 14);
        // ctrl+2  press  keys , then after a break press L key
        System.out.println("Volume of the rectangle is : "+ localVariable);
	}

}
