package week6.day4;

public class LearnThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+  " VALUE OF THE Number IS "+ i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		
		LearnThread lt = new LearnThread();
		LearnThread lt1 = new LearnThread();
		lt.start();
		lt1.start();
		
		

	}

}
