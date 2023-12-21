package com.learning.threads;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyThread thread = new MyThread();
			Thread t1 = new Thread(thread);
			t1.start();
			System.out.println("t1.start() started");
			
			new MySecondThread().start();
			System.out.println("MySecondThread started");
			
			System.out.println("Main execution has finished");
	}

}

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(4000l);
			System.out.println("MyThread thread done");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
class MySecondThread extends Thread{
	
	@Override
	public void run() {
		try {
			Thread.sleep(6000l);
			System.out.println("MySecondThread thread done");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
}
