package Concurrency;

public class FibonacciThread implements Runnable {
	
	private int n;
	
	public FibonacciThread(int n) {
		super();
		this.n = n;
	}

	private int getFibonacci(int i){
		if(i == 0){
			return 0;
		}else if(i== 1){
			return 1;
		}
			
		return getFibonacci(i-1) +getFibonacci(i-2);
	}

	@Override
	public void run() {
		System.out.println("Fibonacci("+n+")="+getFibonacci(n));

	}

	public static void main(String[] args) {
		Thread t = new Thread(new FibonacciThread(13));
        t.start();
	}

}

