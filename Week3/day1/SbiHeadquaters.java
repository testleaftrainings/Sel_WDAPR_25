package week3.day1;

public abstract class SbiHeadquaters implements RBI {
	
	// hQ,approveLoan,auditBranches,manageHR
	public void hq() {
		System.out.println("SBI HQ is Delhi");
	}
	abstract void approveLoan();
	abstract void auditBranch();
	abstract void manageHR();
}
