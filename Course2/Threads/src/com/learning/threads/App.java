package com.learning.threads;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyThread thread = new MyThread();
			Thread t1 = new Thread(thread);
			t1.start();
			
			new MySecondThread().start();
	}

}

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Out thread ran");
		
	}
	
}
class MySecondThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Second thread ran");
    }
	
}
