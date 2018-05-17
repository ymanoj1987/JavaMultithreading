package demo1;

class Runner extends Thread{
	public void run() {
		for(int i =0; i<10 ; i++) {
			System.out.println("Helo " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


public class App1 {

	public static void main(String[] args) {
		
		Runner runner = new Runner();
		runner.start();
		
		Runner runner1  = new Runner();
		runner1.start();

	}

}
