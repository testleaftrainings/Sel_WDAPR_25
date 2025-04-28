package week3.day1;

public interface RBI {
	//montenoryPolicy,CashReserveRatio,SLR,interestRate
	//return-type method-name1(parameter-list)
	void monetoryPolicy();
	void crr();
	void slr();
	void interestRate();
	// implemented methods , starting for the java version 8
	default void NPCI() {
		System.out.println("National Payment Corporation of India is supervised by RBI ");
	}
	
	
	
	
	

}
