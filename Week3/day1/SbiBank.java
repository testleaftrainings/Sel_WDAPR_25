package week3.day1;

public class SbiBank extends SbiHeadquaters {
	@Override
	public void monetoryPolicy() {
		System.out.println("KYC is mandatory to open the savings or current account");
	}
	@Override
	public void crr() {
		System.out.println("4% of the net assest is to be maintained as CashReserveRatio");
	}
	@Override
	public void slr() {
		System.out.println("20% of the gross assest is to be maintained as SLR");
	}
	@Override
	public void interestRate() {
		System.out.println("Bank rate guidance is to be followed");
	}

	@Override
	void approveLoan() {
		System.out.println("If loan amount less than 10 cr");
	}
	@Override
	void auditBranch() {
		System.out.println("every 3 months audit is done");
	}
	@Override
	void manageHR() {
		System.out.println("Any job related openings will only be posted By HQ ");
	}

	
	public static void main(String[] args) {
		SbiBank sbiChennai = new SbiBank();
		sbiChennai.monetoryPolicy();
		sbiChennai.approveLoan();
		sbiChennai.hq();
		sbiChennai.manageHR();
		sbiChennai.NPCI();
	}
}
