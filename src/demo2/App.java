package demo2;

class Runner implements Runnable{
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

public class App {

	public static void main(String[] args) {
		Thread t1 =  new Thread(new Runner());
		Thread t2  =  new Thread(new Runner());
		
		t1.start();
		t2.start();
		
	}
}


