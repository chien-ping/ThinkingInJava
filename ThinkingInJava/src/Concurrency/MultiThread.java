package Concurrency;

public class MultiThread implements Runnable {
 
	public MultiThread() {
		super();
		System.out.println("task inialized");
	}


	@Override
	public void run() {
		for(int i = 0; i < 3; i++){
			System.out.println(Thread.currentThread().getName()+" count="+i);
		}
        System.out.println("task over");
	}
	

	public static void main(String[] args) {
		
		Thread t = new Thread(new MultiThread());
		t.start();
	}

}
